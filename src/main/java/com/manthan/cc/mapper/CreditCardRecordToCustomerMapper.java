package com.manthan.cc.mapper;

import com.manthan.cc.dto.CreditCardRecordsDTO;
import com.manthan.cc.entity.Customer;
import com.manthan.cc.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditCardRecordToCustomerMapper {

    private final EducationService educationService;

    private final GenderService genderService;

    private final MarriageService marriageService;

    private final DefaultPaymentService defaultPaymentService;

    private final MonthlyStatementService monthlyStatementService;

    @Autowired
    public CreditCardRecordToCustomerMapper(EducationService educationService, GenderService genderService,
                                            MarriageService marriageService, DefaultPaymentService defaultPaymentService,
                                            MonthlyStatementService monthlyStatementService) {
        this.educationService = educationService;
        this.genderService = genderService;
        this.marriageService = marriageService;
        this.defaultPaymentService = defaultPaymentService;
        this.monthlyStatementService = monthlyStatementService;
    }

    /**
     * @param record
     * @return
     */
    public Customer getCustomer(final CreditCardRecordsDTO record) {
        Customer customer = new Customer();
        customer.setId(Long.valueOf(record.getId()));
        customer.setName(record.getName().trim());
        customer.setAge(Integer.valueOf(record.getAge()));
        customer.setCcLimit(record.getLimitBalance());
        customer.setEducation(educationService.findById(Integer.valueOf(record.getEducation())));
        customer.setGender(genderService.findById(Integer.valueOf(record.getSex())));
        customer.setMarriage(marriageService.findById(Integer.valueOf(record.getMarriage())));
        customer.setDefaultPayment(defaultPaymentService.findById(Integer.valueOf(record.getDefaultPayment())));
        customer.setMonthlyStatements(monthlyStatementService.getLastSixMonthsStatements(record));
        return customer;
    }


}
