import java.util.Scanner;

public class zad21908 {
    public static void main(String[] args) {
        int a, b;

        Scanner Scanner = new Scanner(System.in);

        System.out.print("введитЕ 1 число");
        a = Scanner.nextInt();

        System.out.print("введитЕ 2 число");
        b = Scanner.nextInt();
        if (a%2!=0){a++;}

        while (a <= b){
            System.out.println(a);
           a+=2;


    }


        }
}

