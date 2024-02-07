package com.cdmg_iesam.features.bank.domain;

public class PaymentUseCase {

    private BankRepository bankRepository;

    public PaymentUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public void execute(int ammount, String id){
        this.bankRepository.payment(ammount, id);
    }

}
