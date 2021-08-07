package fr.gime.issakzei.custumerservice.web;

import fr.gime.issakzei.custumerservice.dto.CustomerResponseDTO;
import fr.gime.issakzei.custumerservice.dto.CustumerRequestDTO;
import fr.gime.issakzei.custumerservice.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CustomerRestAPI {
    private CustomerService customerService;

    public CustomerRestAPI(CustomerService customerService){
        this.customerService= customerService;
    }

    @GetMapping(path="/customers")
    public List<CustomerResponseDTO> allCustomers(){
        return customerService.listCustomers();
    }
    @PostMapping(path="/customers")
    public CustomerResponseDTO save(CustumerRequestDTO custumerRequestDTO){
        return customerService.save(custumerRequestDTO);
    }

    @GetMapping(path= "/customers/{id}")
    public CustomerResponseDTO getCustomer(@PathVariable String id){
        return customerService.getCustomer(id);
    }

}
