package com.TAN.LAB9.repository;

import com.TAN.LAB9.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    // This provides CRUD methods for the Invoice entity.
}

