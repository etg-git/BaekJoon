//https://www.acmicpc.net/problem/10872 팩토리얼
package BaekJoon.OneStage;

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        System.out.println(fact(K));
    }

    static int fact(int K) {
        int num = 1;
        for (int i = K; i >= 1; i--) {
            num = num * i;
        }
        return num;

    }
}

