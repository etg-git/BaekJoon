package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int[] nazzi = new int[K];
        int sum = 0;
        for(int point = 0; point<K; point++) {
                if (point == 0)
                    nazzi[point] = 0;
                else if (point == 1)
                    nazzi[point] = 1;
                else
                    nazzi[point] = nazzi[point - 1] + nazzi[point - 2];

                if(nazzi[point] > 0 && nazzi[point] < K && nazzi[point] % 2 == 0) {
                    sum = sum + nazzi[point];
                    System.out.println(nazzi[point]);
                }
        }
        System.out.println(sum);
    }
}

