package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringBuilder sb = new StringBuilder();
        String[] upper = a.split("-");
        String c;
        for(int i=0; i<upper.length; i++) {
                 c = upper[i];
            sb = sb.append(c.charAt(0));
        }
        System.out.println(sb);
    }
}
