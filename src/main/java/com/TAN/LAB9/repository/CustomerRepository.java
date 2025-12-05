package com.TAN.LAB9.repository;

import com.TAN.LAB9.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // This provides CRUD methods for the Customer entity.
}
