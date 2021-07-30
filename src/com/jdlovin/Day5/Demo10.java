package com.jdlovin.Day5;

class Bank {
    int balance = 1_000_000_000;

    synchronized void withdraw(int amount) {
        System.out.println("withdraw processing...");
        if (balance < amount) {
            System.out.println("balance insufficient, waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawal complete");
    }

   synchronized void deposit(int amount) {
        System.out.println("deposit processing...");
        balance += amount;
        System.out.println("deposit completed");
        notify();
    }

}

    class WithdrawThread extends Thread{
        Bank bank;

        public WithdrawThread(Bank bank){
            this.bank = bank;
        }

        @Override
        public void run() {
            bank.withdraw(2_000_000_000);
        }
    }
    class DepositThread extends Thread {
        Bank bank;

        public DepositThread(Bank bank) {
            this.bank = bank;
        }

        @Override
        public void run() {
            bank.deposit(2_000_000_000);
        }
    }



public class Demo10 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        WithdrawThread withdrawThread = new WithdrawThread(bank);
        DepositThread depositThread = new DepositThread(bank);

        withdrawThread.start();
        depositThread.start();


    }
}
