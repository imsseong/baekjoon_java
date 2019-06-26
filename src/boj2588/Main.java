package boj2588;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//버퍼 이용해서 입력 값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); //(1)첫번째 세 자리 자연수
		String input = br.readLine();
		String[] nums = input.split(""); //(2)두 번째 세 자리 자연수
		
		//곱하기 계산 과정 중 (3),(4),(5)의 값 출력
		int[] res = new int[3];
		for(int i = 0; i < 3; i++) {
			res[i] = n * Integer.parseInt(nums[2 - i]);
			bw.write(String.valueOf(res[i])+"\n");
		}
		
		//(6)곱해진 총 결과값
		bw.write(String.valueOf(res[0] + res[1]*10 + res[2]*100));
		
		br.close();
		bw.close();
	}

}
