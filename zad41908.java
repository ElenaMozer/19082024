import java.util.Scanner;

public class zad41908 {
    public static void main(String[] args) {
        int a, b, sum, count;

        Scanner Scanner = new Scanner(System.in);

        System.out.print("введитЕ 1 число");
        a = Scanner.nextInt();//2

        System.out.print("введитЕ 2 число");
        b = Scanner.nextInt();//8
        sum = 0;
        count = 0;
        while (a <= b) {
            sum += a;
            a += 1;
            count++;
        }

        System.out.println(sum);
        System.out.println(sum/count);
    }
}
