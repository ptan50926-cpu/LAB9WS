package com.TAN.LAB9.repository;

import com.TAN.LAB9.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<EntityClass, IdType>
public interface ProductRepository extends JpaRepository<Product, Long> {
    // No code needed here! Spring Data JPA automatically provides
    // findById, findAll, save, deleteById, etc.
}
