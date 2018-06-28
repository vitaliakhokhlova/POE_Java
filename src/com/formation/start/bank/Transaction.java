package com.formation.start.bank;

import com.formation.start.bank.Account;

import java.util.Date;

public class Transaction {

    private static int compteur = 0;
    private int id;
    private Date date = new Date();
    private int amount;
    private Account toAccount;
    private Account fromAccount;

    public Transaction(int amount) {
        this.amount = amount;
        this.id = ++compteur;

    }

    public Transaction(int amount, Account fromAccount, Account toAccount) {
        this.amount = amount;
        this.id = ++compteur;
        //this.setToAccount(toAccount);
        //this.setFromAccount(fromAccount);
        fromAccount.withdraw(amount);
        toAccount.debit(amount);
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                ", from=" + fromAccount +
                ", to=" + toAccount +
                '}';
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }
}
