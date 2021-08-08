package fr.gime.issakzei.custumerservice.repositories;

import fr.gime.issakzei.custumerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
