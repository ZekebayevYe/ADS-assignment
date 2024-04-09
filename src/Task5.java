import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Reverse(n, sc);
    }

    public static void Reverse(int n, Scanner sc) {
        if (n != 0) {
            int num = sc.nextInt();
            Reverse(n - 1, sc);
            System.out.print("" + num + " ");
        }
    }
}
