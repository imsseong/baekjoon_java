package boj1978;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0; // 소수 값 개수, 출력 값
        int chk; // 나눠지는 수 개수 체크

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            chk = 0;
            for(int j = 1; j <= num; j++) {
                if(num % j == 0) chk++;
        }
        if(chk == 2) count++; // 나눠지는 값이 1과 자기자신 뿐이면 소수개수 ++
        }

        System.out.println(count);
    }
}
