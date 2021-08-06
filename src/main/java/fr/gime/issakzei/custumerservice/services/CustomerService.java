package fr.gime.issakzei.custumerservice.services;

import fr.gime.issakzei.custumerservice.dto.CustomerResponseDTO;
import fr.gime.issakzei.custumerservice.dto.CustumerRequestDTO;

import java.util.List;

public interface CustomerService {
    //methode permettant d'ajouter un customer
    CustomerResponseDTO save(CustumerRequestDTO custumerRequestDTO);

    //Consulter un customer en fonction de son id
     CustomerResponseDTO getCustomer(String id);
     //Modification de customer
     CustomerResponseDTO updateCustomer(CustumerRequestDTO custumerRequestDTO);

     //Liste des customers
    List<CustomerResponseDTO> listCustomers();
}
