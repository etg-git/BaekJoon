package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> st = new Stack<>();
        String K = br.readLine();
        int size = 0;
        for(int i = 0; i<K.length(); i++) {
            char token = K.charAt(i);

            if (token == '(') {
                st.push('(');
            } else if (token == ')') {
                st.pop();

                if (K.charAt(i - 1) == '(') {
                    size = size + st.size(); //레이저를 쏜 다음 그 이전의 push한 size
                } else
                    size = size + 1; // ()이외
            }
        }
        System.out.println(size);
    }
}
