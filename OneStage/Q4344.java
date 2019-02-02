//https://www.acmicpc.net/problem/4344 평균은넘겠지
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        for(int i=0; i<K; i++) {
            int sum = 0;
            String test = br.readLine();
            String[] point = test.split(" ");
            int a = Integer.parseInt(point[0]);
            while(a>0) {
                sum = sum + Integer.parseInt(point[a]);
                a--;
            }
            int b = Integer.parseInt(point[0]);
            sum = sum/b;

            double d=0;
            for(int j=1; j<=point.length-1; j++) {
                double c=0;
                if(sum < Integer.parseInt(point[j])) {
                    c = (100 / (double)b);
                }
                d= d+ c;

            }
            System.out.println(String.format("%.3f", d) + "%");
        }

    }
}
