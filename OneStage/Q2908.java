// https://www.acmicpc.net/problem/2908 상수

package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        StringBuilder sb1 = new StringBuilder(A);
        StringBuilder sb2 = new StringBuilder(B);

        sb1.setCharAt(0, A.charAt(2));
        sb1.setCharAt(2, A.charAt(0));

        sb2.setCharAt(0, B.charAt(2));
        sb2.setCharAt(2, B.charAt(0));


        int a = Integer.parseInt(String.valueOf(sb1));
        int b = Integer.parseInt(String.valueOf(sb2));

        if(a>b) System.out.println(sb1);
        else if(a<b) System.out.println(sb2);
    }
}
