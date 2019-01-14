package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            sb.append(st.nextToken()).append(" ");
        }
        System.out.println(sb);
    }
}
