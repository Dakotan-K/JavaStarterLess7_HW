public class Arithmetics {

    static int add (int a, int b) {
        return a + b;
    }
    static int sub (int a, int b) {
        return a - b;
    }
    static int mul (int a, int b) {
        return a * b;
    }
    static int div (int a, int b) {
        if (b != 0) {
        return a / b;
    } else System.out.println("На ноль делить нельзя!");
        return -1;
    }

    public static void main(String[] args) {
        int a = 10, b = 0;

        int add = add (a, b);
        System.out.println("а + b = " + add);

        int sub = sub (a, b);
        System.out.println("a - b = " + sub);

        int mul = mul (a, b);
        System.out.println("a * b = " + mul);

        int div = div (a, b);
        System.out.println("a / b = " + div);
    }
}
