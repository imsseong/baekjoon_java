package boj10171;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//고양이 문자열을 버퍼를 이용해 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\\n");
		bw.write(" )  ( ')\n");
		bw.write("(  /  )\n");
		bw.write(" \\(__)|");
		
		//출력하고 stream 닫기
		bw.close();
	}

}
