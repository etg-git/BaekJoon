package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int mul = A*B*C;
        int a = 0, b =0, c=0, d =0, e=0, f=0,g=0, h=0, j=0, k=0;
        String mul1 = Integer.toString(mul);
        char token;
        for(int i=0; i<mul1.length(); i++) {
            token = mul1.charAt(i);
        switch(token) {
            case '0' : a++;break;
            case '1' : b++;break;
            case '2' : c++;break;
            case '3' : d++;break;
            case '4' : e++;break;
            case '5' : f++;break;
            case '6' : g++;break;
            case '7' : h++;break;
            case '8' : j++;break;
            case '9' : k++;break;
        }

        }
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" +f + "\n" +g + "\n" +h + "\n" +j + "\n" +k);
    }
}
