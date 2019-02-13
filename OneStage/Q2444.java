package BaekJoon.OneStage;

import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        String star[] = new String[2*K];
        for(int i=0; i<2*K-1; i++) {
            if(i == K-1) {
                sb.append("*");
            }
            else if(i<K-1) {
                sb.append(" ");
            }
        }
        star[0] = String.valueOf(sb);

        System.out.println(star[0]);
        for(int i=1; i<=K-1; i++) {
            sb.setCharAt(K-i-1, '*');
            sb.append('*');
            star[i] = String.valueOf(sb);

            System.out.println(star[i]);
        }

        for(int i=K-2; i>=0; i--) {
            System.out.println(star[i]);
        }


    }
}
