package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9020 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        int store[] = new int[K];
        for(int i=0; i<K; i++) {
            int J = Integer.parseInt(br.readLine());
            store[i] = J;
        }
        int count = 0;
        for(int st : store) {
            for(int i=2; i<st; i++) {
                if(st%i==0) count++;
            }
        }
    }
}
