import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(sumPower(b, n));
    }

    public static int sumPower(int b, int n) {
        if (n == 0) {
            return 1;
        } else {
            int result = b;

            for(int i = 1; i < n; ++i) {
                result *= b;
            }

            return result + sumPower(b, n - 1);
        }
    }
}
