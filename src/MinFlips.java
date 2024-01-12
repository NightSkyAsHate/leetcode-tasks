public class MinFlips {

    public static void main(String[] args) {
        System.out.println(minFlips("10111"));
        System.out.println(minFlips("101"));
        System.out.println(minFlips("00000"));
    }

    public static int minFlips(String target) {
        boolean inversion = false;
        int flips = 0;
        for (int i = 0; i < target.length(); i++) {
            boolean notZero = target.charAt(i) == '1';
            if (inversion != notZero) {
                flips++;
                inversion = !inversion;
            }
        }
        return flips;
    }
}
