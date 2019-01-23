//https://www.acmicpc.net/problem/1152 단어의개수
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        StringTokenizer st = new StringTokenizer(a);

        int sum = 0;

        while(st.hasMoreTokens()) {
            if(st.nextToken().equals(" ")) {
                return;
            }
            else {
                sum = sum + 1;
            }
        }
        System.out.println(sum);
    }
}
