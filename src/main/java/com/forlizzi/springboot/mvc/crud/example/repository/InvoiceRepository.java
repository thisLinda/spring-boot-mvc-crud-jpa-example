package com.forlizzi.springboot.mvc.crud.example.repository;

import com.forlizzi.springboot.mvc.crud.example.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

// TWO: after entity class is coded, create a repository interface for each entity (to access the database)
// spring data jpa provides all methods by default for basic crud, do not need custom methods
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
