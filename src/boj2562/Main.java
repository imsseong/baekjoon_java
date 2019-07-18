package boj2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numbers = new ArrayList<>();
		int maxNum = 0;
		int index = 0;
		for(int i = 0; i < 9; i ++) {
			numbers.add(Integer.parseInt(br.readLine()));
			if(maxNum < numbers.get(i)) {
				maxNum = numbers.get(i);
				index = i;
			}
		}
		System.out.println(maxNum + "\n" + (index + 1));
	}
}
