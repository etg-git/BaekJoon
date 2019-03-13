//https://www.acmicpc.net/problem/2447 별찍기 - 10
package BaekJoon.OneStage;

import java.util.Arrays;
import java.util.Scanner;

public class Q2447 {

    private static final Scanner sc = new Scanner(System.in);
    private static char[][] star;

    public static void main(String[] args) {
        int K = sc.nextInt();
        star = new char[K][K];

        for(int i=0; i<K; i++) {
            Arrays.fill(star[i], ' ');
        }

        Map(0,0,K);
        for(int i=0; i<K; i++) {
            System.out.println(star[i]);
        }
    }
    public static void Map(int a, int b, int n) {
        if(n==1) {
            star[a][b] = '*';
            return;
        }
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(i==1 && j==1) {
                    continue;
                }
                Map(a+(n/3)*i, b+(n/3)*j, n/3);
            }
        }
    }
}