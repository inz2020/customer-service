package fr.gime.issakzei.custumerservice.services;
import fr.gime.issakzei.custumerservice.dto.CustomerRequestDTO;
import fr.gime.issakzei.custumerservice.dto.CustomerResponseDTO;



import java.util.List;

public interface CustomerService {
    //methode permettant d'ajouter un customer
    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);

    //Consulter un customer en fonction de son id
     CustomerResponseDTO getCustomer(String id);
     //Modification de customer
     CustomerResponseDTO updateCustomer(CustomerRequestDTO customerRequestDTO);

     //Liste des customers
    List<CustomerResponseDTO> listCustomers();
}
