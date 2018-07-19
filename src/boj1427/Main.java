package boj1427;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        char[] nums = new char[n.length()];

        for(int i = 0 ; i < n.length(); i++) {
            nums[i] = n.charAt(i);
        }

        Arrays.sort(nums);

        for(int i = nums.length-1; i >=0; i--) {
            bw.write(String.valueOf(nums[i]));
        }

        br.close();
        bw.close();
    }
}