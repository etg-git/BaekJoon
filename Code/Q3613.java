package BaekJoon.Code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String K = br.readLine();
        StringBuilder sb = new StringBuilder();
        String[] token = K.split("_");
        String c;
            if (K.charAt(0) == '_') {//c++일떄 오류
                System.out.println("Error!");
            } else if (K.charAt(K.length()-1) == '_') {
                System.out.println("Error!");
            } else if (K.contains("__")) {
                System.out.println("Error!");
            }
            else if(K.contains("_")) {
                for (int i = 0; i < token.length; i++) {
                    if ((int) token[i].charAt(0) > 97) {
                        c = token[i];
                        sb.append(Character.toUpperCase(c.charAt(0))).append(token[i].substring(1));
                    }
                }
            }System.out.print(sb);

        String x = "";
        char tok;
        for (int i = 0; i < K.length(); i++) {//java일때 오류
           if (!K.contains("_")) {
               if ((int)K.charAt(0) < 97) {
                   System.out.println("Error!");break;
               }
                tok = K.charAt(i);
                int a = (int) tok;
                if (a >= 97) {
                    x = x + (char) a;
                } else if (a<97){
                    a = a + 32;
                    x = x + "_" + (char) a;
                }
            }else if(K.charAt(i) == '_') {
               System.out.println("Error!");break;
           }

        }System.out.print(x);
    }
}
