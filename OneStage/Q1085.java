//https://www.acmicpc.net/problem/1085 직사각형에서 탈출
package BaekJoon.OneStage;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sqr = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sqr);
        int[] a = new int[5];
        int i= 0;
        while(st.hasMoreTokens()) {
            a[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        int min=0;
        if(a[3] - a[1] >= a[2] - a[0]) {
            min = a[2] - a[0];
        }
        else if(a[3] - a[1] <= a[2] - a[0]) {
            min = a[3] - a[1];
        }

        if(min>=1) {
            System.out.println(min);
        }
    }
}
