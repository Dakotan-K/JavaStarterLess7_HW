import sun.font.DelegatingShape;

import java.util.Scanner;

public class NumbersCheck {
    static int check(int a) {
        if (a > 0) {
            System.out.println("1. Введенное число положительное");
        } else System.out.println("1. Введенное число отрицательное");
        if ((a == 2) || (a == 3) || (a == 5) || (a == 7)) {
            System.out.println("2. Введенное число является простым");
        } else if ((a % 2 == 0) || (a % 3 == 0) || (a % 5 == 0)) {
            System.out.println("2. Введенное число не является простым");
        } else System.out.println("2. Введенное число является простым");
        if (a % 2 == 0) {
            System.out.println("3. Введенное число делится на 2 без остатка");
        } else if (a % 3 == 0) {
            System.out.println("3. Введенное число делится на 3 без остатка");
        } else if (a % 5 == 0) {
            System.out.println("3. Введенное число делится на 5 без остатка");
        } else if (a % 6 == 0) {
            System.out.println("3. Введенное число делится на 6 без остатка");
        } else if (a % 9 == 0) {
            System.out.println("3. Введенное число делится на 9 без остатка");
        } else System.out.println("3. Введенное число не делится без остатка на 2, 3, 5, 6 либо 9");
        return 0;
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int check = check(number);
    }
}