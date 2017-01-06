package hu.schonherz.training.jpa.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "product", schema = "webshop")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity extends BaseEntity {
    private String name;
    private String description;
    private String url;
}
