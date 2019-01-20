//https://www.acmicpc.net/problem/11365 !밀비급일 문제
package BaekJoon.OneStage;

import java.util.*;

public class Q11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> que = new LinkedList<>();

        char c;

        while(sc.hasNextLine()) {
            String a = sc.nextLine();
            if(a.equals("END")) {
                break;
            }
            for(int i=0; i<a.length(); i++) {
                c = a.charAt(i);
                que.add(c);
            }

            for(int i=0; i<a.length(); i++) {
                System.out.print(que.removeLast());
                if(i==a.length()-1) {
                    System.out.println("");
                }
            }

            }
        }
    }

