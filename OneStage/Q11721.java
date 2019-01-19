//https://www.acmicpc.net/problem/11721

package BaekJoon.OneStage;

import java.util.Scanner;

public class Q11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String token = sc.next();
        String a = "";
        for(int i=0; i<token.length(); i++) {
            a = a + token.charAt(i);
            if(a.length() == 10) {
                System.out.println(a);
                a = "";
            }
        }
        System.out.println(a);
    }
}