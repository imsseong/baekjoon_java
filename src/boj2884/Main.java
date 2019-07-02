package boj2884;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		if(minute < 45) {
			hour--;
			minute += 15; //60Ка - 45Ка = 15Ка
		} else {
			minute -= 45;
		}
		
		if(hour < 0) {
			hour += 24;
		}
		System.out.println(hour + " " + minute);

	}

}
