package com.forlizzi.springboot.mvc.crud.example.service;

// FIVE: annotate with @Service to inform spring container that this is the service class
// by convention the implementation class has the suffix Impl

import com.forlizzi.springboot.mvc.crud.example.entity.Invoice;
import com.forlizzi.springboot.mvc.crud.example.exception.InvoiceNotFoundException;
import com.forlizzi.springboot.mvc.crud.example.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl implements IInvoiceService {

    @Autowired
    private InvoiceRepository repo;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return repo.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        // optional: a container object to contain not-null objects, handles values instead of checking for null values
        Optional<Invoice> opt = repo.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        } else {
            throw new InvoiceNotFoundException("Invoice with Id : "+id+" Not Found");
        }
    }

    @Override
    public void deleteInvoiceById(Long id) {
        repo.delete(getInvoiceById(id));
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        repo.save(invoice);
    }

}