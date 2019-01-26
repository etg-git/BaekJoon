//https://www.acmicpc.net/problem/10039 평균점수
package BaekJoon.OneStage;

import java.util.Scanner;

public class Q10039 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sum = 0;
    for(int i=0; i<5; i++) {
        int K = sc.nextInt();

        if(K<40) {
            K = 40;
        }

        sum += K;
        }
        System.out.println(sum/5);
    }
}
