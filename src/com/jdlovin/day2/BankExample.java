package com.jdlovin.day2;

interface MyBankAccount{
    boolean deposit(double amount);
    boolean withdrawal(double amount);
    void getBalance();
}

class SavingAccount implements MyBankAccount{

    private double _balance;
    private double _perDayLimit;

    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        return true;
    }

    @Override
    public boolean withdrawal(double amount) {
        if(_balance < amount){
            System.out.println("Not enough funds");
            return false;
        } else if(_perDayLimit + amount > 5000) {
            System.out.println("Exceeded daily limit");
            return false;
        } else{
            _balance -= amount;
            _perDayLimit += amount;
            System.out.println("Successful withdrawal " + amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Savings Account Balance" + _balance);

    }
}

class CheckingAccount implements MyBankAccount{

    private double _balance;
    private double _perDayLimit;

    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        return true;
    }

    @Override
    public boolean withdrawal(double amount) {
        if(_balance < amount){
            System.out.println("Not enough funds");
            return false;
        } else if(_balance + amount > 5000){
            System.out.println("Exceeded daily limit");
            return false;
        } else {
            System.out.println("Successfully withdrawn: " + amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Checking account balance: " + _balance);
    }
}

public class BankExample {
    public static void main(String[] args) {
        MyBankAccount checkings = new CheckingAccount();
        MyBankAccount savings = new SavingAccount();

        checkings.deposit(250);
        checkings.withdrawal(400);
        checkings.getBalance();
    }
}
