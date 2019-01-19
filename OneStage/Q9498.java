package BaekJoon.OneStage;

        import java.util.Scanner;

public class Q9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        if(K >= 90 && K<= 100) {
            System.out.println("A");
        }
        else if(K>=80 && K < 90) {
            System.out.println("B");
        }
        else if(K>=70 && K <80){
            System.out.println("C");
        }
        else if(K>=60 && K<70){
            System.out.println("D");
        }
        else System.out.println("F");
    }
}
