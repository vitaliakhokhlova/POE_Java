package com.formation.start;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private String number = "0000";
    private String bank = "noname";
    private Client client;
    private int balance = 0;
    private int interestRate = 0;
    private ArrayList<Transaction> transactionList = new ArrayList<>();

    //prof
    private boolean isActive = true;
    private boolean isBlocked = false;
    private int id = 0;
    private Date creationDate = new Date();

    public Account() {
    }

    public Account(String number, String bank, Client client, int... balance) {
        this.number = number;
        this.bank = bank;
        this.client = client;
        if (balance.length > 0) this.balance = balance[0];
        if (balance.length > 1) this.interestRate = balance[1] / 100;
       // System.out.println("Account is created");
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", bank='" + bank + '\'' +
                ", proprietor='" + client + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", isActive=" + isActive +
                ", isBlocked=" + isBlocked +
                ", id='" + id + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public String getBank() {
        return bank;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void displayRIB() {
        System.out.println("RIB:");
        System.out.println("--------------------------");
        System.out.println("Account number: " + number);
        System.out.println("Bank: " + bank);
        System.out.println("Client: " + client);
        System.out.println("--------------------------");
    }

    public void debit(int debit) {
        if (isActive && !isBlocked) {
            balance += debit;
            Transaction transaction = new Transaction(debit);
            transaction.setFromAccount(null);
            transaction.setToAccount(this);
            transactionList.add(transaction);
            //System.out.println("Account " + number + " is debited of " + debit);
            //System.out.println("New balance is " + balance);
        }
    }

    public void credit(int credit) {
        balance -= credit;
        //System.out.println("Account " + number + " is credited of " + credit);
        //System.out.println("New balance is " + balance);
        if (balance < 0) System.out.println("Attention, overdraft!");
    }

    public int getBalance() {
        return this.balance;
    }

    public void addInterest() {
        if (balance > 0) balance *= 1 + interestRate;
        //System.out.println("Interest");
        //System.out.println("New balance is " + balance);
    }

    //prof
    public boolean withdraw(int amount) {
        if (isActive && !isBlocked) {
            if (amount <= balance) {
                balance -= amount;
                Transaction transaction = new Transaction(-amount);
                transaction.setToAccount(null);
                transaction.setFromAccount(this);
                transactionList.add(transaction);
                //System.out.println(amount + " has been withdrawn");
                //System.out.println("New balance is " + balance);
                return true;
            } else {
                //System.out.println("Not enough to withdraw" + amount);
                //System.out.println("Balance is " + balance);
                return false;
            }
        } else {
            //System.out.println("The account is closed");
            return false;
        }
    }

    public void block() {
        isBlocked = true;
        //System.out.println("Account has been blocked");
    }

    public void unblock() {
        isBlocked = false;
        //System.out.println("Account has been unblocked");
    }

    public void close() {
        isActive = false;
        //System.out.println("Account has been closed");
    }

    /*public void addTransaction(Transaction transaction){
        transactionList.add(transaction);
        balance += transaction.getAmount();
    }*/

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public void printTransactionList(){
        System.out.println("Transaction list of " + client.getFirstName() + " " + client.getLastName());
        System.out.println("--------------------------");
        for(Transaction t : transactionList){
            System.out.println(t);
        }
        System.out.println("--------------------------");
    }

    public void transfer(int amount, Account account){
        if(isActive&&!isBlocked){
            if(amount<=balance){
                Transaction transaction = new Transaction(-amount);
                transaction.setFromAccount(this);
                transaction.setToAccount(account);
                transactionList.add(transaction);
            }
        }
    }
}
