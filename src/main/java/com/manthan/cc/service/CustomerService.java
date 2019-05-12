package com.manthan.cc.service;

import com.manthan.cc.entity.Customer;
import com.manthan.cc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * @param customer
     */
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    /**
     * @return
     */
    public List<Customer> findAll() {
        List<Customer> list = new ArrayList<>();
        Iterable<Customer> customers = customerRepository.findAll();
        customers.forEach(list::add);
        return list;
    }

    /**
     * @param id
     * @return
     */
    public Customer findById(final long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.orElseGet(Customer::new);
    }
}
