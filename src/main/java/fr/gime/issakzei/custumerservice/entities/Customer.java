package fr.gime.issakzei.custumerservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor @Data @NoArgsConstructor
public class Customer {
    @Id
    private String id;
    private String name;
    private String email;
}
