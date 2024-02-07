package com.cdmg_iesam.features.bank.domain;

public interface BankRepository {

    void charge(int ammount, String id);

    void payment(int ammount, String id);

}
