package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String K = br.readLine();
        String J = br.readLine();
        StringTokenizer st = new StringTokenizer(K);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int seq = 0;

        String[] sp = J.split(" ");
        for(int i=0; i<sp.length; i++) {
            int temp = 0;
            seq = Integer.parseInt(sp[i]);
                if(seq <= a && seq < b) {
                    temp = seq;
                    System.out.print(temp + " ");
                }
        }
    }
}
