package boj1475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        int[] num = new int[10];

        for(int i = 0; i < 10; i++) {
            num[i]  = 0;
        }

        num[n % 10]++;
        n /= 10;

        while (n != 0) {
            num[n % 10]++;
            n /= 10;
        }

        count = (num[6] + num[9] + 1) / 2;

        for(int i = 0; i < 10; i++) {
            if(i != 6 && i != 9) {
                if(num[i] > count)
                    count = num[i];
            }
        }

        System.out.println(count);

        sc.close();
    }

}
