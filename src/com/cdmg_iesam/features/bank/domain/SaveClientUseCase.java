package com.cdmg_iesam.features.bank.domain;

public class SaveClientUseCase {

    private BankRepository bankRepository;

    public SaveClientUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public void execute(Clients clients){
        this.bankRepository.saveClient(clients);
    }

}
