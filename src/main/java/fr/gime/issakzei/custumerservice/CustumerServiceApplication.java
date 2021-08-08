package fr.gime.issakzei.custumerservice;

import fr.gime.issakzei.custumerservice.dto.CustomerRequestDTO;
import fr.gime.issakzei.custumerservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"fr.gime.issakzei"})
public class CustumerServiceApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(CustumerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerService customerService){
        return args -> {
            customerService.save(new CustomerRequestDTO("c1", "Abou", "abou@gamail.com"));
            customerService.save(new CustomerRequestDTO("c2", "issa", "issa@gamail.com"));
        };
    }
}
