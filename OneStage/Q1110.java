//https://www.acmicpc.net/problem/1110 더하기 사이클
package BaekJoon.OneStage;

import java.util.Scanner;

public class Q1110 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int cnt = 0, result=n;
            int a, b, temp;
            while(n!=result || cnt==0){
                a= result/10;
                b= result%10;
                temp= (a+b)%10;

                a = b;
                b = temp;
                result = a*10 + b;
                cnt++;
            }
            System.out.println(cnt);
        }
    }