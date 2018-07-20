package boj1929;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 최소값 입력받기
        int n = sc.nextInt(); // 최대값 입력받기
        int[] nums = new int[n + 1];

        nums[1] = 1; // 1은 소수가 아니므로 1로 표시

        for (int i = 2; i <= n; i++) {
            for(int j = 2; i * j <= n; j++) {
                nums[i * j] = 1;
            }
        }

        for(int i = m; i <= n; i++) {
            if(nums[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
