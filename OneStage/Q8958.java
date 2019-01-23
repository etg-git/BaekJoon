//https://www.acmicpc.net/problem/8958 OX퀴즈
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine()) ;

        for(int i=0; i<K; i++) {
            int sum1 = 0;
            int sum2 = 0;
            String ox = br.readLine();
            String[] x = new String[ox.length()];
            for(int j=0; j<ox.length(); j++) {
                x[j] = String.valueOf(ox.charAt(j));

                if(x[j].equals("O")) {
                    sum1 = sum1 + 1;
                }
                else if(x[j].equals("X")) {
                    sum1 = 0;
                }
                sum2 = sum2 + sum1;
            }
            System.out.println(sum2);
        }
    }
}
