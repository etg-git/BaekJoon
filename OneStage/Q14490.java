//https://www.acmicpc.net/problem/14490 백대열
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String K = br.readLine();
        String[] token = K.split(":");

        int a = Integer.parseInt(token[0]);
        int b = Integer.parseInt(token[1]);

        int c = 1;
        for(int i=100000000; i>1; i--) {
            if(a%i==0 && b%i==0) {
                a = a/i;
                b = b/i;
                c = c * i;
            }
        }
        System.out.println(Integer.parseInt(token[0])/c + ":" + Integer.parseInt(token[1])/c);
    }
}
