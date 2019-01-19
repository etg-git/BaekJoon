package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String[] c;
        for(int i=0; i<K; i++) {
            String a = br.readLine();
            c = a.split(" ");

            System.out.println(Integer.parseInt(c[0]) + Integer.parseInt(c[1]));
        }
    }
}
