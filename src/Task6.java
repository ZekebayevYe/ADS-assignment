import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseStr(n, sc);
    }

    public static void ReverseStr(int n, Scanner sc) {
        if (n != 0) {
            char[] str = sc.next().toCharArray();
            ReverseStr(n - 1, sc);
            System.out.println(str);
        }
    }
}
