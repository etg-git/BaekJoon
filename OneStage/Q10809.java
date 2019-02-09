// https://www.acmicpc.net/problem/10809 알파벳찾기
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String K = br.readLine();
        char[] ap = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] find = new int[ap.length];

        for (int i = 0; i < ap.length; i++) {
            find[i] = -1;
        }
        char c;
        int sum = -1;
        for (int i = 0; i < K.length(); i++) {
            c = K.charAt(i);

            for (int j = 0; j < ap.length; j++) {
                if (c == ap[j]) {
                    sum++;
                    find[j] = sum;
                }

            }
        }
        for(int i = 0; i<ap.length; i++) {
            System.out.print(find[i] + " ");
        }
    }
}
