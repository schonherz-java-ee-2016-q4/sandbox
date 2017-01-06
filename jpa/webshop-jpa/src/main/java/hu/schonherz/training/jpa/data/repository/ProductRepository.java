package hu.schonherz.training.jpa.data.repository;

import hu.schonherz.training.jpa.data.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
