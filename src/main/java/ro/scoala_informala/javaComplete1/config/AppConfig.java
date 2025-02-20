package ro.scoala_informala.javaComplete1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean(name = "paymentsEuro")
    @Primary
    public PaymentsConfig paymentsConfig(){
        PaymentsConfig paymentsConfig = new PaymentsConfig();
        paymentsConfig.setCurrency("euro");
        paymentsConfig.setDelimiter(',');
        return paymentsConfig;
    }

    @Bean(name = "paymentsLei")
    public PaymentsConfig paymentsConfigLei(){
        PaymentsConfig paymentsConfig = new PaymentsConfig();
        paymentsConfig.setCurrency("lei");
        paymentsConfig.setDelimiter('.');
        return paymentsConfig;
    }


}
