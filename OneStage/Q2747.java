// https://www.acmicpc.net/problem/2747 피보나치 수
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        int[] fibo = new int[K+1];
        fibo[0] = 0;
        fibo[1] = 1;

        int sum = 0;
        for(int i=0; i<=K; i++) {
            if(i>1) {
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
            sum = fibo[i];

        }
        System.out.println(sum);
    }
}
