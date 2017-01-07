package hu.schonherz.training.jpa.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.schonherz.training.jpa.data.domain.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    ProductEntity findByName(String name);
    List<ProductEntity> findAll();

}
