package fr.gime.issakzei.custumerservice.services;

import fr.gime.issakzei.custumerservice.dto.CustomerRequestDTO;
import fr.gime.issakzei.custumerservice.dto.CustomerResponseDTO;
import fr.gime.issakzei.custumerservice.entities.Customer;
import fr.gime.issakzei.custumerservice.mappers.CustomerMapper;
import fr.gime.issakzei.custumerservice.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

//import org.jvnet.hk2.annotations.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional


public class CustomerServiceImplementation implements  CustomerService {
    @Autowired
    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;


    public CustomerServiceImplementation(CustomerRepository customerRepository,
                                         CustomerMapper customerMapper ){
        this.customerRepository= customerRepository;

        this.customerMapper = customerMapper;
    }
    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {

        /*
        Mapping de customerRequestDTO à Customer
        enregistremement de l'objet customer*/
        Customer customer=customerMapper.customerRequestDTOToCustomer(customerRequestDTO);
        Customer saveCustomer= customerRepository.save(customer);
        customerRequestDTO.setId(saveCustomer.getId());


        /*Customer customer= new Customer();
        customer.setId(customer.getId());
        customer.setName(custumerRequestDTO.getName());
        customer.setEmail(customer.getEmail());*/

        /*
        Mapping de Customer à customerRequestDTO
        enregistremement de l'objet customerRequestDTO */
        CustomerResponseDTO customerResponseDTO= customerMapper.customerToCustomerResponseDTO(saveCustomer);

        /*
       CustomerResponseDTO customerResponseDTO= new CustomerResponseDTO();
       customerResponseDTO.setId(saveCustomer.getId());*/
        return  customerResponseDTO;
    }



    @Override
    public CustomerResponseDTO getCustomer(String id) {
       Customer customer= customerRepository.findById(id).get();

       return customerMapper.customerToCustomerResponseDTO(customer);
    }

    @Override
    public CustomerResponseDTO updateCustomer(CustomerRequestDTO customerRequestDTO) {
       Customer customer= customerMapper.customerRequestDTOToCustomer(customerRequestDTO);
       Customer updatedCustomer= customerRepository.save(customer);

       return customerMapper.customerToCustomerResponseDTO(updatedCustomer);
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {
       List<Customer> customers= customerRepository.findAll();
       List<CustomerResponseDTO> customerResponseDTOS=customers.stream().map(
               cust->customerMapper.customerToCustomerResponseDTO(cust))
               .collect(Collectors.toList());
       return customerResponseDTOS;
    }
}
