package BaekJoon.OneStage;

import java.util.Scanner;

public class Q2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String b = "*";
        String sum = "";
        for(int i=0; i<K; i++) {
            sum = b + sum;
            System.out.println(sum);
        }
    }
}
