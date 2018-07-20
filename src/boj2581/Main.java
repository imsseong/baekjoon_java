package boj2581;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 최소값 입력받기
        int n = sc.nextInt(); // 최대값 입력받기
        int sum = 0; // 소수들의 합
        ArrayList nums = new ArrayList(); // 소수 저장할 ArrayList

        for (int i = m; i <= n; i++) {
            int chk = 0; // 소수인지 아닌지 확인하는 값
            if (i == 1) chk = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    chk = 1;
                    break;
                }
            }
            if (chk == 0) { // 소수이면
                nums.add(i); // ArrayList에 추가하고
                sum += i; // 합친거 더하기
            }
        }

        if (nums.size() == 0) { // 소수가 없을 경우
            System.out.println("-1");
        } else {
            System.out.println(sum); // 소수 합친 핪 출력
            System.out.println(nums.get(0)); // 소수 중 최소값
        }
    }
}
