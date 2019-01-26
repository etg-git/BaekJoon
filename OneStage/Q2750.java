//https://www.acmicpc.net/problem/2750 수 정렬하기
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        int[] sort = new int[K];
        for(int i=0; i<K; i++) {
            sort[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(sort);
        for(int i=0; i<K; i++) {
            System.out.println(sort[i]);
        }

    }
}
