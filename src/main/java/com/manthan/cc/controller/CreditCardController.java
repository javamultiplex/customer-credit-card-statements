package com.manthan.cc.controller;


import com.manthan.cc.entity.Customer;
import com.manthan.cc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/manthan")
public class CreditCardController {

    private final CustomerService customerService;

    @Autowired
    public CreditCardController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/id/{customerId}")
    public ResponseEntity<Customer> findById(@PathVariable("customerId") String customerId) {
        return new ResponseEntity<>(customerService.findById(Long.valueOf(customerId)), HttpStatus.OK);
    }

}
