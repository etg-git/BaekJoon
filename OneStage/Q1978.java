//https://www.acmicpc.net/problem/1978 소수찾기
package BaekJoon.OneStage;
import java.util.Scanner;

public class Q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < K; i++) {
            int count = 0;
            int J = sc.nextInt();
            if(J==1) count++;
            for (int j = 2; j < J; j++) {
                if (J%j == 0) count++;
            }

            if(count ==0) sum++;

        }
        System.out.println(sum);
    }
}
