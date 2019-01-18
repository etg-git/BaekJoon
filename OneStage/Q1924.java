package BaekJoon.OneStage;

import java.util.Scanner;

public class Q1924 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moon = sc.nextInt();
        int sun = sc.nextInt();

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int a = sun;
        for (int i = 0; i < moon - 1; i++) {
        a = a + month[i];//그전달까지와 sun을 합한다.
        }
        System.out.println(day[a % 7]);
        }
        }