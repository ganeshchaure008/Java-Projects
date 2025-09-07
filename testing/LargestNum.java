package testing;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Enter third number: ");
        c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } else if (b >= c && b >= a) {
            System.out.println("The largest number is: " + b);
        } else if (c >= a && c >= b) {
            System.out.println("The largest number is: " + c);
        }
        sc.close();
    }
}
