package hu.schonherz.training.jpa.data.domain;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="shoporder", schema="webshop")
public class OrderEntity extends BaseEntity{

    private static final long serialVersionUID = 1L;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="costumer_id",nullable=false)
    
    @OneToMany
    private Collection<OrderEntryEtity> entries;
    
    private Date orderDate;
    
    
}
