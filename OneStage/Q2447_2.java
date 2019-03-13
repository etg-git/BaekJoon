//https://www.acmicpc.net/problem/2447 별찍기 - 10
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2447_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String star[][] = new String[a + 1][a + 1];
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i % 3 == 2) {
                    if (j % 3 == 2) star[i][j] = " ";
                    else star[i][j] = "*";
                }
                else star[i][j] = "*";

            }
        }
        for(int i=1; i<=a; i++) {
            for(int j=1; j<=a; j++) {

            }
        }
    }
}
