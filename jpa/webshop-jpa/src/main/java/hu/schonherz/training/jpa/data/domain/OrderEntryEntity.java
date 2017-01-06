package hu.schonherz.training.jpa.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "orderentry", schema = "webshop")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntryEntity extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", unique = true, nullable = false)
    private ProductEntity product;
    private int quantity;
}
