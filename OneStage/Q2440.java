package BaekJoon.OneStage;

import java.util.Scanner;

public class Q2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        String star = "";
        for(int i=0; i<K; i++) {
            star = star + "*";
        }

        for(int i=K-1; i>=0; i--){
            System.out.println(star);

            star = star.substring(0, i);

        }
    }
}
