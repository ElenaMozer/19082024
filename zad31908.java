import java.util.Scanner;

public class zad31908 {
    public static void main(String[] args) {
        int a, b;

        Scanner Scanner = new Scanner(System.in);

        System.out.print("введитЕ 1 число");
        a = Scanner.nextInt();

        System.out.print("введитЕ 2 число");
        b = Scanner.nextInt();

        while (a <= b) {
            if (a % 2 == 0) {
                a = a + 1;
            }
        System.out.println(a);
        a += 2; }

        while (a > b) {
            if (b % 2 == 0) {
                b = b + 1;
            }
                System.out.println(b);
            b++;

    }
    }
}

