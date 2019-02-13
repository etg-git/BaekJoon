//https://www.acmicpc.net/problem/2442 별 찍기-5
package BaekJoon.OneStage;

import java.util.Scanner;

public class Q2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<2*K-1; i++) {
            if(i == K-1) {
                sb.append("*");
            }
            else if(i<K-1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
        for(int i=1; i<=K-1; i++) {
            sb.setCharAt(K-i-1, '*');
            sb.append("*");
            System.out.println(sb);
        }
    }
}
