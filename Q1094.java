package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int a = 64;
        int sum = 0;
        int b = 0;
        int save = X;
        while (sum != X) {

            while(a>save) {
                a = a / 2;
            }
            sum = sum + a;
            X = X - a;
            b++;
            a = 64;
        }
        System.out.println(b);
    }
}