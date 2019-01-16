package BaekJoon.Coding;

        import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deliver = sc.nextInt();
        int sug1 = 3;
        int sug2 = 5;
        int sub = 0;
        while (deliver >= sug2) {
            if(deliver % sug1 == 0) {
                if(deliver % 15 == 0) {
                    deliver = deliver - sug2;
                    sub++;
                }else {
                    deliver = deliver - sug1;
                    sub++;
                }
            }
            else if(deliver % sug2 == 0) {
                deliver = deliver - sug2;
                sub++;
            }
            else if(deliver%sug1 != 0 || deliver%sug2 != 0) {
                deliver = deliver - sug2;
                sub ++;
            }
        }
        if((deliver%sug1) == 0 && deliver != 0) {
            sub++;
            System.out.println(sub);
        }
        else if (deliver == 0) {
            System.out.println(sub);
        }
        else System.out.println(-1);
    }
}
