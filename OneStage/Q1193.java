package BaekJoon.OneStage;

import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int[] num1 = new int[K+1];
        int[] num2 = new int[K+1];

        int i = 0, a=1, b=1;
        num1[1] = 1;
        num2[1] = 1;
        while(i<10000000) {
            if(i==1) {
                System.out.println(num1[1] + "/" + num2[1]);
                break;
            }
            b++;


            i++;
        }
    }
}

