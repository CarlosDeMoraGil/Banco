package com.cdmg_iesam.features.bank.data;

import com.cdmg_iesam.features.bank.domain.Account;
import com.cdmg_iesam.features.bank.domain.BankRepository;
import com.cdmg_iesam.features.bank.domain.Transactions;

import java.util.ArrayList;

public class BankDataRepository implements BankRepository {

    private static BankDataRepository instance = null;
    private ArrayList<Account> Cuentas = new ArrayList<>();
    public void initData(){
        Cuentas.add(new Account("1","Carlos",500));
        Cuentas.add(new Account("2","Carlos",500));
    }

    public BankDataRepository() {
        initData();
    }

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

            System.out.println(resultado);

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

            System.out.println(resultado);

        }
    }

    public static BankDataRepository newInstance(){
        if(instance == null){
            instance = new BankDataRepository();
        }
        return instance;
    }


}
