package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        if (n <= 1) {
            a[0] = 1;
            System.out.println(a[a.length -1]);
        }
        else {
            a[0] = 1;
            a[1] = 2;
            for (int i = 2; i < n; i++) {
                a[i] = (a[i - 1] + a[i - 2]) % 10007;
            }
            System.out.println(a[n - 1]);
        }
    }
}
