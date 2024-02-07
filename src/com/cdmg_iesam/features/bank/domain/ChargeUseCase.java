package com.cdmg_iesam.features.bank.domain;

public class ChargeUseCase {

    private BankRepository bankRepository;

    public ChargeUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public void execute(int ammount, String id){
        this.bankRepository.charge(ammount, id);
    }

}
