public class Task3 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        return n == 0 ? 0 : n + sum(n - 1);
    }
}
