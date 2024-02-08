package com.cdmg_iesam.features.bank.data;

import com.cdmg_iesam.features.bank.domain.Account;
import com.cdmg_iesam.features.bank.domain.BankRepository;
import com.cdmg_iesam.features.bank.domain.Clients;
import com.cdmg_iesam.features.bank.domain.Hipoteca;

import java.util.ArrayList;

public class BankDataRepository implements BankRepository {

    private static BankDataRepository instance = null;
    private ArrayList<Account> Cuentas = new ArrayList<>();
    private ArrayList<Hipoteca> Hipotecas = new ArrayList<>();
    private ArrayList<Clients> Clientes = new ArrayList<>();

    @Override
    public void charge(int ammount, String id) {

        if(ammount < 0){

        }else{
            int resultado = 0;

            for(int i = 0; i < Cuentas.size(); i++){
                if(Cuentas.get(i).getId() == id){
                    resultado = Cuentas.get(i).getBalance() + ammount;
                }
            }

        }

    }

    @Override
    public void payment(int ammount, String id) {

        if(ammount < 0){

        }else{
            int resultado = 0;

            for(int i = 0; i < Cuentas.size(); i++){
                if(Cuentas.get(i).getId() == id){
                    resultado = Cuentas.get(i).getBalance() - ammount;
                }
            }


        }
    }

    @Override
    public void createHipoteca(Hipoteca hipoteca) {
        Hipotecas.add(hipoteca);
    }

    @Override
    public void saveClient(Clients clients) {
        Clientes.add(clients);
    }

    @Override
    public void createAccount(Account account) {
        Cuentas.add(account);
    }

    @Override
    public Account printClient(String id) {
        for(Account account : Cuentas){
            if(account.getId().equals(id)){
                return account;
            }
        }

        return null;
    }

    public static BankDataRepository newInstance(){
        if(instance == null){
            instance = new BankDataRepository();
        }
        return instance;
    }


}
