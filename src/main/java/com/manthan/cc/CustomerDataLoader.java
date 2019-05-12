package com.manthan.cc;

import com.manthan.cc.dto.CreditCardRecordsDTO;
import com.manthan.cc.entity.Customer;
import com.manthan.cc.mapper.CreditCardRecordToCustomerMapper;
import com.manthan.cc.service.CustomerService;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

@Component
public class CustomerDataLoader implements CommandLineRunner {

    private final CreditCardRecordToCustomerMapper creditCardRecordToCustomerMapper;

    private final CustomerService customerService;

    private final ResourceLoader resourceLoader;

    @Autowired
    public CustomerDataLoader(CreditCardRecordToCustomerMapper creditCardRecordToCustomerMapper, CustomerService customerService, ResourceLoader resourceLoader) {
        this.creditCardRecordToCustomerMapper = creditCardRecordToCustomerMapper;
        this.customerService = customerService;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void run(String... args) throws Exception {

        Resource resource = resourceLoader.getResource("classpath:credit_card.csv");
        InputStream inputStream = resource.getInputStream();
        List<CreditCardRecordsDTO> records = new CsvToBeanBuilder(new InputStreamReader(inputStream))
                .withType(CreditCardRecordsDTO.class).build().parse();

        for (CreditCardRecordsDTO record : records) {
            Customer customer = creditCardRecordToCustomerMapper.getCustomer(record);
            customerService.save(customer);
        }

    }
}
