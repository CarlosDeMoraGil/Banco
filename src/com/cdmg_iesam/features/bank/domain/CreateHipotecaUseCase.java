package com.cdmg_iesam.features.bank.domain;

public class CreateHipotecaUseCase {

    private BankRepository bankRepository;

    public CreateHipotecaUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public void execute(Hipoteca hipoteca){
        this.bankRepository.createHipoteca(hipoteca);
    }

}
