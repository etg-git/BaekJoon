//https://www.acmicpc.net/problem/2941 //크로아티아 언어
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String K = br.readLine();
        String[] token = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
            for(String tokens : token) {
                if (K.contains(tokens)) {
                 K = K.replaceAll(tokens, "?");
                }
            }
        System.out.println(K.length());
    }
}
