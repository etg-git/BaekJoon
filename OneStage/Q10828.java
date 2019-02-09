//https://www.acmicpc.net/problem/10828 스택
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();

        int K = Integer.parseInt(br.readLine());


        for(int i=0; i<K; i++) {
            String input = br.readLine();
            String[] token = input.split(" ");

            switch(token[0]) {
                case "push" : st.push(Integer.parseInt(token[1]));break;
                case "pop" : if(!st.isEmpty()) {
                    System.out.println(st.pop());
                    break;
                }
                else {
                    System.out.println(-1);
                }break;
                case "size" : {
                    System.out.println(st.size());
                    break;
                }
                case "empty" : {
                    if(st.isEmpty()) {
                        System.out.println(1);break;
                    }
                    else System.out.println(0);break;
                }
                case "top" : {
                    if(!st.isEmpty()) {
                        System.out.println(st.peek());break;
                    }
                    else {
                        System.out.println(-1);break;
                    }
                }
            }

        }
    }
}
