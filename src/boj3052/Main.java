package boj3052;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> remain = new ArrayList<>(42); //나머지
		for(int i = 0; i < 42; i++) {
			remain.add(0); //remain 모두 0으로 초기화
		}
		
		for(int i = 0; i < 10; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
			remain.set(numbers.get(i) % 42, 1); //나머지에 해당하는 인덱스의 값 1로 바꾸기
		}

		int count = 0; //서로 다른 나머지 개수
		for(int i = 0; i < 42; i++) {
			if(remain.get(i) == 1) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
