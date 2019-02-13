//https://www.acmicpc.net/problem/2445 별 찍기 - 8
package BaekJoon.OneStage;

import java.util.Scanner;

public class Q2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        String[] star = new String[2*K];
        for(int i=0; i<=2*K-1; i++) {
            if (i == 0 || i == 2 * K - 1) {
                sb.append('*');
            } else sb.append(' ');
        }
        star[0] = String.valueOf(sb);

        for(int i=1; i<=K; i++) {
            sb.setCharAt(i, '*');
            sb.setCharAt(2*K-1-i, '*');

            star[i] = String.valueOf(sb);
            System.out.println(star[i-1]);
        }
        for(int i=K-2; i>=0; i--) {
            System.out.println(star[i]);
        }
    }
}
