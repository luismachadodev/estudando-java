package main;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account a;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            a = new Account(initialDeposit, holder, number);
        } else {
            a = new Account(number, holder);
        }

        System.out.println("Account data: ");
        System.out.println("Account " + a.getNumber() + ", Holder: " + a.getHolder() + ", Balance: $ " + a.getBalance());

        System.out.println("Enter a deposit value: ");
        double amount = sc.nextDouble();
        a.deposit(amount);

        System.out.println("Updated account data: ");
        System.out.println("Account " + a.getNumber() + ", Holder: " + a.getHolder() + ", Balance: $ " + a.getBalance());

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        a.withdraw(withdraw);

        System.out.println("Account data: ");
        System.out.println("Account " + a.getNumber() + ", Holder: " + a.getHolder() + ", Balance: $ " + a.getBalance());
    }
}
