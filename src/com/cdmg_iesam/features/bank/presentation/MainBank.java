package com.cdmg_iesam.features.bank.presentation;

import com.cdmg_iesam.features.bank.data.BankDataRepository;
import com.cdmg_iesam.features.bank.domain.ChargeUseCase;
import com.cdmg_iesam.features.bank.domain.PaymentUseCase;

public class MainBank {

    public static void charge(int ammount, String id){
        ChargeUseCase chargeUseCase = new ChargeUseCase(BankDataRepository.newInstance());
        chargeUseCase.execute(ammount, id);

    }
    public static void payment(int ammount, String id){
        PaymentUseCase paymetUseCase = new PaymentUseCase(BankDataRepository.newInstance());
        paymetUseCase.execute(ammount, id);

    }

}
