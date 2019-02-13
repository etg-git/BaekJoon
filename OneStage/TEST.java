package BaekJoon.OneStage;

import java.util.StringTokenizer;

public class TEST {
    public static void main(String[] args) {

        String token = "hello my name is eom tae gyun";
        StringTokenizer st = new StringTokenizer(token);
        StringBuilder sb = new StringBuilder(token);
        sb.setCharAt(3, 'a');

        System.out.println(sb.toString());
//        while (st.nextToken()){
////            System.out.println(st.nextToken());
        }
    }
