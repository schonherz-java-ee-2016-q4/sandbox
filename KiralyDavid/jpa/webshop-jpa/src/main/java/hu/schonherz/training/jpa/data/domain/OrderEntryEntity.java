package hu.schonherz.training.jpa.data.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name="product", schema="webshop")
public class OrderEntryEntity extends BaseEntity{  
    private static final long serialVersionUID = 1L;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="product_id", unique=true, nullable=false)
    private ProductEntity product;
    private int quantity;

}