package BaekJoon.OneStage;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class Q10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String K = br.readLine();

        StringTokenizer st = new StringTokenizer(K, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if((a>= b && a>=c && b>=c) || (a<=c && a<=b && b<=c)) {
            System.out.println(b);
        }
        else if((b>=c && b>=a && a>=c) || (b<=c && b<=a && a<=c)) {
            System.out.println(a);
        }
        else System.out.println(c);
    }
}
