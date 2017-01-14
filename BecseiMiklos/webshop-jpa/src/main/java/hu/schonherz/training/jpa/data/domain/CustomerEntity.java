package hu.schonherz.training.jpa.data.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customer", schema = "webshop")
public class CustomerEntity extends BaseEntity {
    private String name;
    private String email;

}


