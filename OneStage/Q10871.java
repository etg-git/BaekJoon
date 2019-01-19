package BaekJoon.OneStage;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        String[] token1 = a.split(" ");
        String[] token2 = b.split(" ");

        for(int i = 0; i < Integer.parseInt(token1[0]); i++) {
            if(Integer.parseInt(token1[1]) > Integer.parseInt(token2[i])) {
                System.out.print(token2[i] + " ");
            }
        }
    }
}

