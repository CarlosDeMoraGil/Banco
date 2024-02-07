package com.cdmg_iesam.features.bank.domain;

public class Account {

    private String id;
    private String owner;
    //private Transactions transactions;
    //private Hipoteca hipoteca;
    private int balance;

    public Account(String id, String owner, int balance) {
        this.id = id;
        this.owner = owner;
        //this.transactions = transactions;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
