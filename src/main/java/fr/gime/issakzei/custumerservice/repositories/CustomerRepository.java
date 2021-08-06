package fr.gime.issakzei.custumerservice.repositories;

import fr.gime.issakzei.custumerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
