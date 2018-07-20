package boj1181;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>(); // 순서가 없고 중복 불가인 set
        for(int i = 0; i < n; i++) {
            hs.add(br.readLine());
        }

        /* HashSet을 배열로 변환 */
        String[] words = new String[hs.size()];
        hs.toArray(words);

        /* 알파벳 사전 순으로 정렬 */
        Arrays.sort(words);

        /* 길이 짧은 것부터 정렬 */
        Arrays.sort(words, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        for(String output : words) {
            bw.write(output + "\n");
        }

        bw.flush();
    }
}
