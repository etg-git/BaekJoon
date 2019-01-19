//https://www.acmicpc.net/problem/1546

package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String J = br.readLine();

        StringTokenizer st = new StringTokenizer(J);
        StringTokenizer st1 = new StringTokenizer(J);
        int[] a = new int[K];
        int max = 0;
        for(int i =0; i<K; i++){
            a[i] = Integer.parseInt(st.nextToken());
            if(a[i] > max) {
                max = a[i];
            }
        }
        int max1 = max;
        int[] b = new int[K];
        float c = 0.00f;
        for(int i = 0; i<K; i++) {
            b[i] = Integer.parseInt(st1.nextToken());
            c = c + (float)b[i]/max1*100;
        }
        System.out.println(c/K);
    }
}
