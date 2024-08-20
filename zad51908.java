import java.util.Scanner;

public class zad51908 {
    public static void main(String[] args) {
        int i, n, result = 1;

        Scanner Scanner = new Scanner(System.in);

        System.out.print("введитЕ 1 число");
        i = Scanner.nextInt();//2
        System.out.print("введитЕ 2 число");
        n = Scanner.nextInt();//2

        while (i < n) {
            for ( i = 1; i <= n; i++) {
                result = result*i;
            }

            System.out.println(result);

        }
    }
}
