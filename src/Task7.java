import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        fillSpiral(array, 0, n - 1, 1);

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void fillSpiral(int[][] array, int start, int end, int num) {
        if (start <= end) {
            int i;
            for(i = start; i <= end; ++i) {
                array[start][i] = num++;
            }

            for(i = start + 1; i <= end; ++i) {
                array[i][end] = num++;
            }

            for(i = end - 1; i >= start; --i) {
                array[end][i] = num++;
            }

            for(i = end - 1; i > start; --i) {
                array[i][start] = num++;
            }

            fillSpiral(array, start + 1, end - 1, num);
        }
    }
}
