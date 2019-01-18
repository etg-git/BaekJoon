package BaekJoon.OneStage;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String token = sc.next();
        char c;
        int sum = 0;
        for(int i=0; i<K; i++) {

            c = token.charAt(i);

            sum = sum + ((int)c - 48);

        }
        System.out.println(sum);
    }
}
