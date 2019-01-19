package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1476 {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String K = br.readLine();
    StringTokenizer st = new StringTokenizer(K);

    int E = Integer.parseInt(st.nextToken()); // 1 ≤ E ≤ 15
    int S = Integer.parseInt(st.nextToken()); // 1 ≤ S ≤ 28
    int M = Integer.parseInt(st.nextToken()); // 1 ≤ M ≤ 19
    int sum = 1;

    int e = 1;
    int s = 1;
    int m = 1;
    while(true) {
        if(e == E && s == S && m == M) {
            System.out.println(sum);return;
        }
        if(e >= 15) {
            e=0;
        }
        if(s >= 28) {
            s=0;
        }
        if(m >= 19) {
            m=0;
        }
        e++; s++; m++; sum++;
        }

        }
    }
