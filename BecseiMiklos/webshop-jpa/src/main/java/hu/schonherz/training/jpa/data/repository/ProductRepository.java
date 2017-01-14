package hu.schonherz.training.jpa.data.repository;

import hu.schonherz.training.jpa.data.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    ProductEntity findByName(String name);
    List<ProductEntity> findAll();
}
