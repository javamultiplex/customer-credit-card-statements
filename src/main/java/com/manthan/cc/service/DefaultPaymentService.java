package com.manthan.cc.service;

import com.manthan.cc.entity.DefaultPayment;
import com.manthan.cc.repository.DefaultPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultPaymentService {

    private final DefaultPaymentRepository defaultPaymentRepository;

    @Autowired
    public DefaultPaymentService(DefaultPaymentRepository defaultPaymentRepository) {
        this.defaultPaymentRepository = defaultPaymentRepository;
    }

    /**
     * @param id
     * @return
     */
    public DefaultPayment findById(long id) {
        Optional<DefaultPayment> defaultPayment = defaultPaymentRepository.findById(id);
        return defaultPayment.orElseGet(DefaultPayment::new);
    }
}
