public class Task10 {

    public static void main(String[] args) {
        for(int i = 0; i != 33; ++i) {
            System.out.println("" + i + (isPowerOfTwo(i) ? " is power of 2" : " is not power of 2"));
        }

    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            return n % 2 != 0 ? false : isPowerOfTwo(n / 2);
        }
    }
}
