//https://www.acmicpc.net/problem/2941
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String K = br.readLine();
        String[] token = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
            for(int b=0; b<token.length; b++) {
                if (K.contains(token[b])) {
                 K = K.replaceAll(token[b], "*");
                }
            }
        System.out.println(K.length());
    }
}
