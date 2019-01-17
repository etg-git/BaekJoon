package BaekJoon.OneStage;

import java.util.Scanner;

public class Q2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        String star = "";

        for(int i = 0; i<K; i++) {
            star = star + "*";
        }

        StringBuilder sb = new StringBuilder(star);

        for(int i=0; i<K;i++) {
            System.out.println(sb);
            sb.setCharAt(i, ' ');
        }
    }
}
