package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {//스택 K수만큼 생성
            Stack<Character> st = new Stack<>();
            boolean stk = true;
            int j = 0;
            String cnt = br.readLine();
            int a = cnt.length();
            char token;
            while (a > 0) {//cnt만큼 돌림
                token = cnt.charAt(j);
                if (token == '(') {
                    st.push('(');
                } else if (token == ')') {
                    if(!st.isEmpty()) {
                        st.pop();
                    }
                    else {// 열린괄호가 없고 닫힌괄호가 있을경우 boolean false
                        stk = false;
                        break;
                    }
                    }
                j++;
                a--;
                }
            if(!st.isEmpty()) stk = false; //스택이 비어있지않을때

             if(stk){ //true일때
                System.out.println("YES");
            }//false일때
            else System.out.println("NO");
        }
    }
}