package boj2108;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 정수 개수
        int sum = 0;
        int scale;
        int maxCount = Integer.MIN_VALUE;
        int[] nums = new int[n];
        int[] sortedNums = new int[n];
        int[] countArr = new int[8001];

        /* 배열 입력 받기 */
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sortedNums[i] = nums[i];
            sum += nums[i];
        }

        Arrays.sort(sortedNums);

        /* 1. 산술평균 */
        int avg = (int)Math.round((double)sum / n);
        bw.write(Integer.toString(avg) + "\n");

        /* 2. 중앙값 */
        int median = sortedNums[(n - 1) / 2];
        bw.write(Integer.toString(median) + "\n");

        /* 3. 최빈값 */
        for(int i = 0; i < n; i++) {
            countArr[nums[i] + 4000]++;
        } // 입력값이 -4000이면 인덱스는 0

        for(int i = 0; i <countArr.length; i++) {
            if(maxCount < countArr[i]) maxCount = countArr[i];
        }

        int count = 0;
        int mode = 0;
        for(int i = 0 ; i < countArr.length; i++) {
            if(countArr[i] == maxCount) {
                count++;
                mode = i - 4000;
            }

            if(count == 2) break;
        }
        bw.write(Integer.toString(mode) + "\n");

        /* 4. 범위 */
        scale = sortedNums[n-1] - sortedNums[0];
        bw.write(Integer.toString(scale) + "\n");

        br.close();
        bw.close();

    }
}