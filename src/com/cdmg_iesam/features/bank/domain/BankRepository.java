package com.cdmg_iesam.features.bank.domain;

public interface BankRepository {

    void charge(int ammount, String id);

    void payment(int ammount, String id);

    void createHipoteca(Hipoteca hipoteca);

    void saveClient(Clients clients);
    void createAccount(Account account);
    Account printClient(String id);

}
