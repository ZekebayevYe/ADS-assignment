public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumOf(numbers, 5));
    }

    public static int sumOf(int[] numbers, int n) {
        return n == 0 ? 0 : numbers[n - 1] + sumOf(numbers, n - 1);
    }
}
