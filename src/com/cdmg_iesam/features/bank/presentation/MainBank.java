package com.cdmg_iesam.features.bank.presentation;

import com.cdmg_iesam.features.bank.data.BankDataRepository;
import com.cdmg_iesam.features.bank.domain.*;

public class MainBank {

    public static void charge(int ammount, String id){
        ChargeUseCase chargeUseCase = new ChargeUseCase(BankDataRepository.newInstance());
        chargeUseCase.execute(ammount, id);

    }
    public static void payment(int ammount, String id){
        PaymentUseCase paymetUseCase = new PaymentUseCase(BankDataRepository.newInstance());
        paymetUseCase.execute(ammount, id);

    }
    public static void createHipoteca(Hipoteca hipoteca){
        CreateHipotecaUseCase createHipotecaUseCase = new CreateHipotecaUseCase(BankDataRepository.newInstance());
        createHipotecaUseCase.execute(hipoteca);
    }
    public static void saveClient(Clients clients){
        SaveClientUseCase saveClientUseCase = new SaveClientUseCase(BankDataRepository.newInstance());
        saveClientUseCase.execute(clients);
    }
    public static void createAccount(Account account){
        CreateAccountUseCase createAccountUseCase = new CreateAccountUseCase(BankDataRepository.newInstance());
        createAccountUseCase.execute(account);
    }
    public static void printClient(String id){
        GetClientUseCase getClientUseCase = new GetClientUseCase(BankDataRepository.newInstance());
        Account account = getClientUseCase.execute(id);
        System.out.print(account.toString());
    }

}
