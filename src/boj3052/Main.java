package boj3052;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> remain = new ArrayList<>(42); //������
		for(int i = 0; i < 42; i++) {
			remain.add(0); //remain ��� 0���� �ʱ�ȭ
		}
		
		for(int i = 0; i < 10; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
			remain.set(numbers.get(i) % 42, 1); //�������� �ش��ϴ� �ε����� �� 1�� �ٲٱ�
		}

		int count = 0; //���� �ٸ� ������ ����
		for(int i = 0; i < 42; i++) {
			if(remain.get(i) == 1) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
