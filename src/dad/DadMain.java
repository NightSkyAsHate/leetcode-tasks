package dad;

public class DadMain {
    public static void main(String[] args) {
        int i = 1; // целочесленные значения
        byte j = 1; // целочисленный, но меньше
        double k = 1.2; // дробное число
        float a = 1.2f; // дробное число, но точнее
        long l = 12l; // целочисленный, большой
        char c = '1';
        String s = "1231312312gfmkngrgui4nkjg5g";
        boolean f = false;
        String g = "Hello world!";











        int chislo1 = 1;
        int chislo2 = 125;
        int result = add(chislo1, chislo2);
        System.out.println(result);
        result = minus(chislo1, chislo2);
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }
}
