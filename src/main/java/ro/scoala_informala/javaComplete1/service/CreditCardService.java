package ro.scoala_informala.javaComplete1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ro.scoala_informala.javaComplete1.config.PaymentsConfig;

@Service
@RequiredArgsConstructor
public class CreditCardService {

    @Value("${my.custom.message}")
    private String message;

    @Qualifier("paymentsEuro")
    private final PaymentsConfig paymentsConfig;

    public String process() {
        return message + paymentsConfig.getCurrency() ;
    }

}
