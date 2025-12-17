package javaobjects;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bankaccount1 acc = new Bankaccount1();
        System.out.println();
        System.out.print("Enter Account No: ");
        
        
        
        
        acc.setAccountNo(sc.nextInt());

        sc.nextLine(); 

        System.out.print("Enter Holder Name: ");
        acc.setHolderName(sc.nextLine());

        System.out.print("Enter Initial Amount: ");
        acc.setBalance(sc.nextDouble());

        System.out.println("\nWelcome Sir, " + acc.getHolderName());
        acc.displayBalance();

        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.print("Choose option: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\nEnter deposit amount: ");
                acc.deposit(sc.nextDouble());
                break;

            case 2:
                System.out.print("\nEnter withdraw amount: ");
                acc.withdraw(sc.nextDouble());
                break;

            case 3:
                acc.displayBalance();
                break;
            default:
                System.out.println("Invalid option");
        }

        System.out.println("\nFinal Balance: " + acc.getBalance());
        sc.close();
    }
}
