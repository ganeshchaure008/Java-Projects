package testing;

import java.util.Scanner;

public class MyAge {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        age = sc.nextInt();
        System.out.println("You are " + age + " years old.");
        sc.close();

    }

}
