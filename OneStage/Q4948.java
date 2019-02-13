//https://www.acmicpc.net/problem/4948 베르트랑 공준
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int min = Integer.parseInt(br.readLine());
            int sum =0;
            if(min == 0) break;

            for(int i=min+1; i<= min*2; i++) {
                int count = 0;
                for(int j = 2; j<min; j++) {
                    if(i % j == 0) {
                        count++;break;
                    }
                }
                if(count ==0) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
