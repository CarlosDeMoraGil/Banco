package com.cdmg_iesam.features;

import com.cdmg_iesam.features.bank.domain.Account;
import com.cdmg_iesam.features.bank.domain.Clients;
import com.cdmg_iesam.features.bank.domain.Hipoteca;
import com.cdmg_iesam.features.bank.domain.Transactions;
import com.cdmg_iesam.features.bank.presentation.MainBank;


public class Main {
    public static void main(String[] args) {

        Clients c1 = new Clients("1","Carlos","de Mora Gil","Sotillo","Sotillo","05420");
        Transactions t1 = new Transactions("1","Paga",500);
        Account cuenta = new Account("1",500,null,null,null);
        Hipoteca h1 = new Hipoteca("1","Piso","piso","1","2","20%","80000");

        MainBank.charge(150,"1");
        MainBank.saveClient(c1);
        MainBank.createAccount(cuenta);
        cuenta.setClients(c1);
        cuenta.setTransactions(t1);
        cuenta.setHipoteca(h1);

        MainBank.printClient("1");


    }
}