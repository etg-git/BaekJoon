//https://www.acmicpc.net/problem/2447 별찍기 - 10
package BaekJoon.OneStage;

import java.util.Scanner;

public class Q2447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String star = "";
        String[] K = new String[a+1];
        for(int i =1; i<=a; i++) {
            if(i % 3 == 0) {
                for(int j=1; j<=a; j++) {
                    star = star + "*";
                }
            }
            else if(i % 3 == 2) {
                for (int j=1; j<=a; j++) {
                    if(j%3 == 2) {
                        star = star + " ";
                    }
                    else {
                        star = star + "*";
                    }
                }
            }
            else if(i % 3 == 1) {
                for(int j=1; j<=a; j++) {
                    star = star+ "*";
                }
            }
            StringBuilder sb = new StringBuilder(star);
            K[i-1] = String.valueOf(sb);
            System.out.println(K[i-1]);
            star = "";
        }
    }
}
