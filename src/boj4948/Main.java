package boj4948;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] nums = new boolean[246913];

        nums[0] = nums[1] = true; // 0과 1은 소수 아님
        while(true) {
            int n = sc.nextInt();
            if(n == 0) break;
            int count = 0; // 소수 개수
            for(int i = 2; i <= 2*n; i++) {
                for(int j = 2; i * j <= 2*n; j++) {
                    nums[i * j] = true;
                }
            }
            for(int i = n + 1; i <= 2 * n; i++) {
                if(!nums[i]) count++;
            }
            System.out.println(count);
         }

    }
}
