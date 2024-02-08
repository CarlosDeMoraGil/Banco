package com.cdmg_iesam.features.bank.domain;

public class CreateAccountUseCase {

    private BankRepository bankRepository;

    public CreateAccountUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public void execute(Account account){
        this.bankRepository.createAccount(account);
    }

}
