package boj9012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println(isVPS(sc.next()) ? "YES" : "NO");
        }
    } // main

    private static boolean isVPS(String str) {
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(') {
                count++;
            } else count--;
            if(count < 0) return false;
        }
        if(count != 0) return false;
        return true;
    } // isVPS()
}
