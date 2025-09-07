package TuesdayJava;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String fullName;
        int rollNumber;
        String department;
        String email;
        long mobileNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Full name:");
        fullName = scanner.nextLine();
        System.out.println("Enter Roll number:");
        rollNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Your Department:");
        department = scanner.nextLine();
        System.out.println("Enter Email:");
        email = scanner.nextLine();
        System.out.println("Mobile:");
        mobileNumber = scanner.nextLong();
        System.out.println("Student Details:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("Mobile Number: " + mobileNumber);
        scanner.close();

    }
}
