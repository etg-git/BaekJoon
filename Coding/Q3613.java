package BaekJoon.Coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String K = br.readLine();
        if (K.charAt(0) == '_') {//처음 _일때
            System.out.println("Error!");
            return;
        } else if (K.charAt(K.length() - 1) == '_') {//마지막 _일떄
            System.out.println("Error!");
            return;
        } else if (K.charAt(0) >= 'A' && K.charAt(0) <= 'Z') {//처음 소문자 아닐때
            System.out.println("Error!");
            return;
        }
//        else if ((int) K.charAt(K.length() - 1) < 97) {// 마지막 대문자 일때
//            System.out.println("Error!");
//            return;
//        }
        boolean java = true;
        boolean cpp = true;
        for (int i = 0; i < K.length(); i++) {
            if (K.charAt(i) == '_') {
                if (K.contains("__")) {// __이상 올때
                    System.out.println("Error!");
                    return;
                }
                java = false;
            } else if (K.charAt(i) >= 'A' && K.charAt(i) <= 'Z') {
                cpp = false;
            }
        }
            if(!java && !cpp) { //대문자 _ 섞여있을때
                System.out.println("Error!"); return;
            }
             if(java && cpp) { //소문자만 그냥 출력
                System.out.println("Error!"); return;
            }
        StringBuilder sb = new StringBuilder();
        String[] token = K.split("_");
        String c;
        String x = "";
        char tok;
        if(!K.contains("_")) {
            for (int k = 0; k < K.length(); k++) {//java일때 오류
                tok = K.charAt(k);
                int a = (int) tok;
                if (a >= 97) {
                    x = x + (char) a;
                } else if (a < 97) {
                    a = a + 32;
                    x = x + "_" + (char) a;
                }
            }
            System.out.println(x);
        }else {
            for (int j = 0; j < token.length; j++) {
                c = token[j];
                sb.append(Character.toUpperCase(c.charAt(0))).append(token[j].substring(1));
            }
            System.out.print(sb);
        }
    }
}