package hu.schonherz.training.jpa.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode(of = { "id" })
@Table(name = "customer", schema = "webshop")
public class CustomerEntity extends BaseEntity {
    private String name;
    private String email;
}
