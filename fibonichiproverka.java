public class fibonichiproverka {
    public static void main(String[] args) {
        long num1 = 0, num2 = 1, N = 100;
        while (num1 < N) {
            for (long i = 0; i < N; i++) {

                System.out.print(num1 + " ");

                long num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
            }
        }
    }
}

