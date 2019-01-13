package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ab = br.readLine();
        int edit = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < ab.length(); i++) {//입력을 받았던 string을 한문자씩 푸쉬
            char token = ab.charAt(i);
            st1.push(token);
        }
        for (int j = 0; j < edit; j++) {//edit값만큼 for문 돌림
            String abc = br.readLine();

            switch (abc) {
                case "L": //st1 값을 빼서 st2에 푸시
                    if (!st1.empty()) {
                        st2.push(st1.pop());
                        break;
                    } else break;
                case "D": //st2 값을 빼서 st1에 푸시
                    if (!st2.empty()) {
                        st1.push(st2.pop());
                        break;
                    } else break;
                case "B": //st1 값을 뺌
                    if (!st1.empty()) {
                        st1.pop();
                        break;
                    } else break;
            }
            if (abc.contains("P")) { //임의의 $값을 푸쉬
                char $ = abc.charAt(2);
                st1.push($);
            }

        }
        while (!st1.isEmpty()) {//st2가 비어질때 까지 st1에 푸시
            st2.push(st1.pop());
        }
        while(!st2.isEmpty()) {
            sb.append(st2.pop());
        }
        System.out.println(sb);
    }
}
