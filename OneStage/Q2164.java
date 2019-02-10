//https://www.acmicpc.net/problem/2164 카드2
package BaekJoon.OneStage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        ArrayList<Integer> li = new ArrayList<>();

        for(int i = 1; i<=a; i++) {
            li.add(i);
        }

        int b = li.size();
        for(int i=0; i<a-1; i++) {
                li.remove(0);

              if(li.size() == b-1) {
                  li.add(li.remove(0));
                 b--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<li.size(); i++) {
            sb.append(li.get(i));
        }
        System.out.println(sb);
    }
}

//        int[] card = new int[a+1];
//        for(int i=0; i<a; i++) {
//            card[i] = i+1;
//        }
//        for(int i=1; i<=card.length-1; i++) {
//            if(i%2 == 0) {
//                for (int j = 0; j < card.length-2; j++) {
//                    card[j] = card[j + 1];
//                }
//            }
//            else if(i%2 == 1) {
//                    card[card.length-2] = card[i];
//                }
//        }
//        System.out.println(card[0]);

