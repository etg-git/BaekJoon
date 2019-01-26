// https://www.acmicpc.net/problem/2920 음계
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Q2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String K = br.readLine();

        String[] sort = K.split(" ");
        int a=0,b=0;
        int[] k = new int[sort.length];
        for(int i=0; i<sort.length-1; i++) {
            k[i] = Integer.parseInt(sort[i]);
            k[i+1] = Integer.parseInt(sort[i+1]);
            if(k[i] == k[i+1] -1) {
                a++;
            }
            else if(k[i] == k[i+1] + 1) {
                b++;
            }
        }
        if(a==7) {
            System.out.println("ascending");
        }
        else if(b==7) {
            System.out.println("descending");
        }
        else System.out.println("mixed");
    }
}
