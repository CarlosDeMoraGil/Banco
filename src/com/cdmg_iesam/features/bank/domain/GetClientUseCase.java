package com.cdmg_iesam.features.bank.domain;

public class GetClientUseCase {

    private BankRepository bankRepository;

    public GetClientUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public Account execute(String id){
        return this.bankRepository.printClient(id);
    }

}
