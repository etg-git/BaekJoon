package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            String Ab = br.readLine();

            Character[] token = new Character[Ab.length()];
            for (int j = 0; j < Ab.length(); j++) {
                token[j] = Ab.charAt(j);
            }
            System.out.println(token);

        }
    }
}
