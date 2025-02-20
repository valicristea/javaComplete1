package ro.scoala_informala.javaComplete1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.scoala_informala.javaComplete1.service.PaymentsProcessor;

@RestController
public class PaymentController {

    @Autowired
    PaymentsProcessor paymentsProcessor;

    @GetMapping("/")
    public String processPayment(@RequestParam(value = "method") String method) {
        return paymentsProcessor.processPayment(method);
    }

}
