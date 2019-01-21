//https://www.acmicpc.net/problem/2675 문자열반복
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        String a = "";
        for(int i=0; i<K; i++) {
            String st = br.readLine();
            String[] token = st.split(" ");

            for(int j=0; j<token[1].length(); j++) {
                int first = Integer.parseInt(token[0]);
                while(first --> 0) {
                    a = a + token[1].charAt(j);
                }
            }
            System.out.println(a);
            a="";
        }
    }
}
