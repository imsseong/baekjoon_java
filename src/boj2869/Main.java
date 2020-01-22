package boj2869;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long up = Long.parseLong(st.nextToken()); //낮에 올라가는 미터
		long down = Long.parseLong(st.nextToken()); //밤에 떨어지는 미터
		long height = Long.parseLong(st.nextToken()); //나무막대 높이
		
		long res = 1 + ((height - up) % (up - down) == 0 ? (height - up) / (up - down) : ((height - up) / (up - down)) + 1);
		
		bw.write(res + "\n");
		
		bw.flush();
		br.close();
		bw.close();
		
	} //main

}
