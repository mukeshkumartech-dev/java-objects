package javaobjects;

public class Bankaccount1 {

     int accountNo;
    String holderName;
     double balance;

   
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
