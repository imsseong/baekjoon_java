package boj9020;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int small = n / 2; // 작은 소수
            int big = n - small; // 큰 소수

            while(true) {
                int schk = sosu(small);
                int bchk = sosu(big);

                if(schk == 0 && bchk == 0) {
                    System.out.println(small + " " + big);
                    break;
                } else {
                    small--;
                    big++;
                }
            }
        }
    }

    private static int sosu(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) // 소수가 아니면
                return 1; // 1리턴
        }
        return 0; // 소수이면 0리턴
    }
}

/*
    4  = 2 + 2    0    4/2=2

    6  = 3 + 3    0    6/2=3
    8  = 3 + 5    2    8/2=4
    10 = 5 + 5    0
    12 = 5 + 7    2
    14 = 3 + 11    0
    14 = 7 + 7

    16 = 3 + 13
    16 = 5 + 11
    16 = 7 + 9    2

    18 = 9 + 9    0
    20 = 9 + 11   2
    22 = 11 + 11  0
    24 = 11 + 13
    26 = 13 + 13
    28 = 13 + 15




*/