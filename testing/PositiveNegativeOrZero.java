package testing;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println("The number is Positive");
        } else if (num < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is zero");
        }
        sc.close();

    }

}
