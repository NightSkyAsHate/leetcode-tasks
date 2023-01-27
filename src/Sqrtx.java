public class Sqrtx {

    public static int mySqrt(int x) {
        int currentValue = 1;
        while (true) {
            long squaredValue = (long) currentValue * currentValue;
            if (squaredValue > x) {
                return currentValue - 1;
            }
            if (squaredValue == x) {
                return currentValue;
            }
            currentValue++;
        }
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4)); // 2
        System.out.println(mySqrt(8)); // 2
        System.out.println(mySqrt(2147483647)); // 2
    }
}
