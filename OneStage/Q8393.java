package BaekJoon.OneStage;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=K; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
