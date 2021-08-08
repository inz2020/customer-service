package fr.gime.issakzei.custumerservice.mappers;

import fr.gime.issakzei.custumerservice.dto.CustomerRequestDTO;

import fr.gime.issakzei.custumerservice.dto.CustomerResponseDTO;
import fr.gime.issakzei.custumerservice.entities.Customer;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")

public interface CustomerMapper {

    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
    Customer customerRequestDTOToCustomer(CustomerRequestDTO customerRequestDTO);
}
