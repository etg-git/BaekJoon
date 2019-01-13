package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] bny = new long[n];

        if(n<=1) {
            bny[0] = 1;
            System.out.println(bny[bny.length-1]);
        }
        else {

            bny[0] = 1;
            bny[1] = 3;
            for(int i=2; i<n; i++) {
                bny[i] = (bny[i - 1] + bny[i - 2] * 2) % 10007;
            }
            System.out.println(bny[n-1]);
        }
    }
}
