//https://www.acmicpc.net/problem/1158 조세퍼스
package BaekJoon.OneStage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();

        for (int i = 1; i <= a; i++) {
            que.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        while(a --> 0) {
            for(int i=0; i<b-1; i++) {
                que.offer(que.poll());
            }
            if(a == 0) {
                sb.append((que.poll()));
            }
            else
            sb.append((que.poll() + ", "));
        }
        System.out.println("<" + sb + ">");
    }
}
