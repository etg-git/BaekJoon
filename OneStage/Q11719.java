package BaekJoon.OneStage;

import java.util.Scanner;

public class Q11719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String a = sc.nextLine();
            if(a.isEmpty()) {
                System.out.print("\n");
            }
            else if(a.length() <= 100) {
                System.out.println(a);
            }
        }
    }
}
