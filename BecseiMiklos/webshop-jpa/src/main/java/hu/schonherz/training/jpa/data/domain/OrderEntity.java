package hu.schonherz.training.jpa.data.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@Table(name = "shoporder", schema = "webshop")
public class OrderEntity extends BaseEntity {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;

    @OneToMany
    private Collection<OrderEntryEntity> entries;

    private Date orderDate;

}


