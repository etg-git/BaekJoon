package BaekJoon.OneStage;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a==0 && b==0)return;

            System.out.println(a+b);
        }
    }
}