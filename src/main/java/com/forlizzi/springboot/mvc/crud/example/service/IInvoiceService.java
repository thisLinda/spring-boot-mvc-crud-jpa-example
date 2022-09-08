package com.forlizzi.springboot.mvc.crud.example.service;

// FOUR: to connect with data layer this interface needs to be a dependency of repository interface with auto-wiring
// by convention the service interface starts with letter I to be recognized as an interface

import com.forlizzi.springboot.mvc.crud.example.entity.Invoice;
import java.util.List;

public interface IInvoiceService {

    Invoice saveInvoice(Invoice invoice);
    List<Invoice> getAllInvoices();
    Invoice getInvoiceById(Long id);
    void deleteInvoiceById(Long id);
    void updateInvoice(Invoice invoice);

}