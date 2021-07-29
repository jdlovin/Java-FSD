package com.jdlovin.Day3;

class NotEnoughMoney extends Exception{

    public NotEnoughMoney(){
        System.out.println("Insufficient amount requested");
    }

    public NotEnoughMoney(String message){
        System.out.println(message);
    }
}

class BankAccount{
    private int balance = 0;
    private int accountNumber;

    public BankAccount(int accountNumber){ //constructor
        this.accountNumber = accountNumber;
    }

    public void deposit (int amount){
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(int amount) throws NotEnoughMoney {
        if (amount <= balance){
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else{
            throw new NotEnoughMoney();
        }
    }

    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

}

public class Demo20 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(2468);
        System.out.println(account.getBalance());
        account.deposit(100_000);
        try {
            account.withdraw(20_000);
        } catch (NotEnoughMoney notEnoughMoney) {
            notEnoughMoney.printStackTrace();
        }
        account.deposit(100_000);
        try {
            account.withdraw(400_000);
        } catch (NotEnoughMoney notEnoughMoney) {
            notEnoughMoney.printStackTrace();
        }
    }

}
