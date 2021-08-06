package fr.gime.issakzei.custumerservice.services;

import fr.gime.issakzei.custumerservice.dto.CustomerResponseDTO;
import fr.gime.issakzei.custumerservice.dto.CustumerRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImplementation implements  CustomerService{
    @Override
    public CustomerResponseDTO save(CustumerRequestDTO custumerRequestDTO) {
        return null;
    }

    @Override
    public CustomerResponseDTO getCustomer(String id) {
        return null;
    }

    @Override
    public CustomerResponseDTO updateCustomer(CustumerRequestDTO custumerRequestDTO) {
        return null;
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {
        return null;
    }
}
