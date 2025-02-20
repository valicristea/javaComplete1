package ro.scoala_informala.javaComplete1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentsProcessor {

    @Autowired
    CreditCardService creditCardService;
    @Autowired
    BankTransferService bankTransferService;


    public String processPayment(String method) {
        return switch (method) {
            case "card" -> creditCardService.process();
            case "transfer" -> bankTransferService.process();
            default -> "invalid prcessing method";
        };
    }
}
