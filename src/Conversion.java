import java.util.Scanner;

public class Conversion {

    static double usd (double a) {
        return a / 74.2;
    }
    static double eur (double a) {
        return a / 90.6;
    }
    static double cny (double a) {
        return a / 11.3;
    }
    static double uah (double a) {
        return a / 2.6;
    }

    public static void main(String[] args) {

        System.out.println("Введите сумму в рублях: ");
        Scanner in = new Scanner(System.in);
        int rub = in.nextInt();

        double usd = usd (rub);
        System.out.println("Конвертация руб/доллар: " + usd);

        double eur = eur (rub);
        System.out.println("Конветрация руб/евро: " + eur);

        double cny = cny (rub);
        System.out.println("Конвертация руб/юянь: " + cny);

        double uah = uah (rub);
        System.out.println("Конвертация руб/гривна: " + uah);
    }
}
