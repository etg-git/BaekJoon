// https://www.acmicpc.net/problem/2443 별찍기 - 6
package BaekJoon.OneStage;

import java.util.Scanner;

public class Q2443 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=2*K-1; i++) {
            sb.append("*");
        }
        System.out.println(sb);

        for(int i=0; i<K-1; i++) {
            sb.setCharAt(i, ' ');
            sb.deleteCharAt(2*K-2-i);

            System.out.println(sb);
        }
    }
}
