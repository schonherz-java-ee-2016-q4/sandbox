package hu.schonherz.training.jpa.data.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customer", schema="webshop")

public class CustomerEntity extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String name;
    private String email;
    
}
