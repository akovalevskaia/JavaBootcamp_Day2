package com.balance_accounter;

public class BankAccount {
    private int balance;
    private String name;

    public BankAccount(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private int deposit(int amount) {
        int limit = 5000;
        if (amount > limit) {
            System.out.printf("Transaction canceled. Max deposit - %d | Your deposit: %d%n", limit, amount);
            return balance;
        }
        return balance += amount;
    }

    private int withdraw(int amount) {
        if(amount > balance) {
            System.out.println("Transfer cancelled. There is not enough fund.");
            return balance;
        }
        return balance -= amount;
    }

    private void printBalance(int amount) {
        System.out.println(balance);
    }

    private  int transferFrom(int amount, BankAccount from, BankAccount to) {
        if (from.balance < amount) {
            System.out.printf("Transfer cancelled. You are trying to transfer %d units, but only %d are available%n", amount, balance);
            return balance;
        }
        from.withdraw(amount);
        to.deposit(amount);
        return balance;
    }

        public static void main(String[] args) {
        BankAccount user1 = new BankAccount(5000, "Inuyasha");
        BankAccount user2 = new BankAccount(670, "Kagome");


        System.out.println("Command 1 - withdraw:");
        System.out.printf("Your balance: %d. After transfer: %d%n", user1.balance, user1.withdraw(535));

        System.out.println("Command 1 - withdraw (try to withdraw more than there is in the bank account):");
        System.out.printf("Your balance: %d. After transfer: %d%n", user1.balance, user1.withdraw(6789));

        System.out.println("Command 2 - deposit:");
        System.out.printf("Your balance: %d. After transfer: %d%n", user1.balance, user1.deposit(677));

        System.out.println("Command 2 - deposit: (more than limit)");
        System.out.printf("Your balance: %d. After transfer: %d%n", user1.balance, user1.deposit(5001));

        System.out.println("Command 3 - transfer");
        System.out.printf("%s transfer to %s%n", user1.name, user2.name);
        System.out.printf("%s's balance: %d. After transfer: %d%n", user1.name, user1.balance, user1.transferFrom(5000, user1, user2));
        System.out.printf("%s transfer to %s%n", user2.name, user1.name);
        System.out.printf("%s's balance: %d. After transfer: %d%n", user2.name, user2.balance, user2.transferFrom(67, user2, user1));
        }
}
