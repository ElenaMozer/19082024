import java.util.Scanner;

public class zad1190824 {
    public static void main(String[] args) {
        int a, b, i;

        Scanner Scanner = new Scanner(System.in);

        System.out.print("введитЕ 1 число");
        a = Scanner.nextInt();
        i = a;
        System.out.print("введитЕ 2 число");
        b = Scanner.nextInt();

        while (i <= b){
            System.out.println(i);
            i++; //a+=1 a=a+1
        }
    }

}
