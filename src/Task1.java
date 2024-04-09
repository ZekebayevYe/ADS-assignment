import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(num(n));
    }

    public static int num(int n) {
        return n == 1 ? 1 : n * n + num(n - 1);
    }

}