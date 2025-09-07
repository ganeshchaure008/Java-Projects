package Calculator;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        int a, b;
        int operation;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        a = sc.nextInt();
        System.out.println("Enter Second Number:");
        b = sc.nextInt();
        System.out.println("Enter operation to do:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction:");
        System.out.println("3.Multiplication:");
        System.out.println("4.Division:");
        operation = sc.nextInt();
        if (operation == 1) {
            System.out.println(a + b);
        } else if (operation == 2) {
            System.out.println(a - b);

        } else if (operation == 3) {
            System.out.println(a * b);

        } else if (operation == 4) {
            System.out.println(a / b);
        } else {
            System.out.println("Enter valid operation to do");
        }

        sc.close();

    }

}
