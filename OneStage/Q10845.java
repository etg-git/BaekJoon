//https://www.acmicpc.net/problem/10845 queue
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Q10845 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        for(int i = 0; i<K; i++) {
            String que = br.readLine();

            switch(que) {
                case "front":
                    if (!queue.isEmpty()) {
                        System.out.println(queue.peekLast());
                        break;
                    } else System.out.println(-1);
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        System.out.println(queue.peekFirst());
                        break;
                    } else System.out.println(-1);
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println(1);
                        break;
                    } else System.out.println(0);
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        System.out.println(queue.pollLast());
                        break;
                    } else System.out.println(-1);
                    break;
                default:
                    break;
            }
            if(que.contains("push")) {
                int X = Integer.parseInt(String.valueOf(que.charAt(5)));

                queue.push(X);
            }
        }
    }
}
