public class Calculate {

    static int calculate (int a, int b, int c) {
        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int result = calculate(a,b,c);
        System.out.println(result);

    }
}
