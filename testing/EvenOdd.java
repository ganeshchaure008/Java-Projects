package testing;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else if (num % 2 != 0) {
            System.out.println("Odd");
        }
        sc.close();

    }

}
