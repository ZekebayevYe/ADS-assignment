import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    static ArrayList<int[]> qw = new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] seq = new int[n];
        printSeq(n, k, seq, 0);
        System.out.println(qw);
    }

    public static void printSeq(int n, int k, int[] seq, int index) {
        if (n == 0) {
            qw.add(seq);
            int[] var8 = seq;
            int var5 = seq.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                int i = var8[var6];
                System.out.print("" + i + " ");
            }

            System.out.println();
        } else {
            for(int i = 1; i <= k; ++i) {
                seq[index] = i;
                printSeq(n - 1, k, seq, index + 1);
            }

        }
    }
}
