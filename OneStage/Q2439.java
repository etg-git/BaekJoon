package BaekJoon.OneStage;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int K = sc.nextInt();

        String sum = "";
        for(int i=0; i<K; i++) {
            sum = " " + sum;
        }
        StringBuilder sb = new StringBuilder(sum);
        for(int i=K-1; i>=0; i--) {
            if(sum.charAt(i) == ' ') {

                sb.setCharAt(i, '*'); //특정위치 치환
            }
            System.out.println(sb);
        }
    }
}
