package boj1874;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int push_num = 1; // push할 숫자 1~n까지
        int chk = 0; // 수열 만들 수 있는지 없는지
        ArrayList<String>output = new ArrayList<>(); // 결과값 +,- 연산

        for(int i = 1; i <= n; i++){
            int num = Integer.parseInt(br.readLine());

            while(stack.isEmpty() || stack.peek() != num) {
                if(push_num > num) {
                    chk = 1; // 수열 만들 수 없다
                    break;
                }
                stack.push(push_num++);
                output.add("+");
            }
            stack.pop();
            output.add("-");
        }

        if(chk == 0) {
            for (String s : output) {
                bw.write(s);
                bw.newLine();
            }
        } else bw.write("NO");


        bw.flush();
    }
}
