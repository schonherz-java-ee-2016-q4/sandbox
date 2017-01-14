package hu.schonherz.training.jpa.data.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orderentry", schema = "webshop")
public class OrderEntryEntity extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", unique = true, nullable = false)
    private ProductEntity product;
    private int quantity;

}
