package hu.schonherz.training.jpa.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "shoporder", schema = "webshop")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity extends BaseEntity {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", unique = true, nullable = false)
    private CustomerEntity customer;

    @OneToMany
    private Collection<OrderEntryEntity> entries;

    private Date date;
}
