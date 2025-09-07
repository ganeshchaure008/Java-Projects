package TuesdayJava;

import java.util.Scanner;

public class SimpleBanking {
    public static void main(String[] args) {
        String accountHolder;
        double balance;
        double depositAmount;
        double withdrawAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Account Holder:");
        accountHolder = scanner.nextLine();
        System.out.println("Initial Balance:");
        balance = scanner.nextDouble();
        System.out.println("Deposited:");
        depositAmount = scanner.nextDouble();
        balance = balance + depositAmount;
        System.out.println("Withdrawn:");
        withdrawAmount = scanner.nextDouble();
        if (withdrawAmount > balance) {
            System.out.println("Insufficient Balance");
        }
 
        else {
            balance = balance - withdrawAmount;
            System.out.println("Final Balance: " + balance);

        }
        scanner.close();

    }

}
