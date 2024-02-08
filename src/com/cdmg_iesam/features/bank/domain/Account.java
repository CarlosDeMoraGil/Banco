package com.cdmg_iesam.features.bank.domain;

public class Account {

    private String id;
    private Clients clients;
    private Transactions transactions;
    private Hipoteca hipoteca;
    private int balance;

    public Account(String id, int balance, Clients clients, Transactions transactions, Hipoteca hipoteca) {
        this.id = id;
        this.balance = balance;
        this.clients = clients;
        this.transactions = transactions;
        this.hipoteca = hipoteca;

    }

    @Override
    public String toString() {
        return "Account" + '\n' +
                "id=" + id + '\n' +
                " balance=" + balance + '\n' +
                " clients=" + clients + '\n' +
                " transactions=" + transactions + '\n' +
                " hipoteca=" + hipoteca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }

    public Hipoteca getHipoteca() {
        return hipoteca;
    }

    public void setHipoteca(Hipoteca hipoteca) {
        this.hipoteca = hipoteca;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
