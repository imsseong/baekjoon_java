package boj2588;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//���� �̿��ؼ� �Է� �� �ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); //(1)ù��° �� �ڸ� �ڿ���
		String input = br.readLine();
		String[] nums = input.split(""); //(2)�� ��° �� �ڸ� �ڿ���
		
		//���ϱ� ��� ���� �� (3),(4),(5)�� �� ���
		int[] res = new int[3];
		for(int i = 0; i < 3; i++) {
			res[i] = n * Integer.parseInt(nums[2 - i]);
			bw.write(String.valueOf(res[i])+"\n");
		}
		
		//(6)������ �� �����
		bw.write(String.valueOf(res[0] + res[1]*10 + res[2]*100));
		
		br.close();
		bw.close();
	}

}
