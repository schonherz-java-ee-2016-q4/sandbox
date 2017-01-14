package hu.schonherz.training.jpa.data.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "product", schema = "webshop")
public class ProductEntity extends BaseEntity {

    private String name;
    private String description;
    private String url;

    public ProductEntity() {
        this.name = name;
        this.description = description;
        this.url = url;
    }
}
