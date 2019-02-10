//https://www.acmicpc.net/problem/1436 영화감독 숌
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        String six = "666";
        int end = 665;
        int sum =0;
        while(true){
            end++;
            if(String.valueOf(end).contains(six)) {
                sum++;
            }
            if(K==sum) {
                System.out.println(end);break;
            }
        }

    }
}
