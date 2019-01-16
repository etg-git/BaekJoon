package BaekJoon.OneStage;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        if(K>=1 && K<=9) {
            for(int j = 1; j<=9; j++) {
                System.out.println(K + " * " + j + " = " + (K * j));
            }
        }
    }
}
