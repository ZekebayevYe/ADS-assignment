import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        printPermutations(str, 0, str.length - 1);
    }

    public static void printPermutations(char[] str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for(int i = left; i <= right; ++i) {
                swap(str, left, i);
                printPermutations(str, left + 1, right);
                swap(str, left, i);
            }
        }

    }

    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
