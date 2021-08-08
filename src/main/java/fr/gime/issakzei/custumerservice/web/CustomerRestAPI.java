package fr.gime.issakzei.custumerservice.web;

import fr.gime.issakzei.custumerservice.dto.CustomerRequestDTO;
import fr.gime.issakzei.custumerservice.dto.CustomerResponseDTO;

import fr.gime.issakzei.custumerservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "/api")
public class CustomerRestAPI {

    private final CustomerService customerService;

    public CustomerRestAPI(CustomerService customerService){
        this.customerService= customerService;
    }

    @GetMapping(path="/customers")
    public List<CustomerResponseDTO> allCustomers(){
        return customerService.listCustomers();
    }
    @PostMapping(path="/customers")
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO){
        return customerService.save(customerRequestDTO);
    }

    @GetMapping(path= "/customers/{id}")
    public CustomerResponseDTO getCustomer(@PathVariable String id){

        return customerService.getCustomer(id);
    }

}
