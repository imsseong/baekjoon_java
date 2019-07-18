package boj10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			numbers.add(Integer.parseInt(st.nextToken()));	
		}
		Collections.sort(numbers); //오름차순 정렬
		System.out.println(numbers.get(0) + " " + numbers.get(N-1));	
	}
}
