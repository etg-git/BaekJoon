package BaekJoon.OneStage;

public class Q4673 {
    public static void main(String[] args) {

        int sum = 1;

        for(int i =1 ; i<=10000; i++) {
            int count = 0;

            for(int j=2; j<i; j++)
                if(i%j == 0) count = count + 1;

                if(count == 0 && i != 2)
                    System.out.println(i);

        }
    }
}
