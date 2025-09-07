package testing;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b;
        int operation;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        b = sc.nextInt();
        System.out.println("Operation to do: ");
        operation = sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        if (operation == 1) {
            System.out.println(a + b);
        } else if (operation == 2) {
            System.out.println(a - b);
        } else if (operation == 3) {
            System.out.println(a * b);
        } else if (operation == 4) {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("0 not allowed in div");
            }

        } else {
            System.out.println("Operation is only have 4 options!");
        }
        sc.close();
    }

}
