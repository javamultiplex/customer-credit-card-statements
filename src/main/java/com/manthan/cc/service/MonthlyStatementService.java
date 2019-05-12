package com.manthan.cc.service;

import com.manthan.cc.dto.CreditCardRecordsDTO;
import com.manthan.cc.entity.MonthlyStatement;
import com.manthan.cc.entity.RepaymentStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonthlyStatementService {

    private final RepaymentStatusService repaymentStatusService;

    private static long count=0;

    @Autowired
    public MonthlyStatementService(RepaymentStatusService repaymentStatusService) {
        this.repaymentStatusService = repaymentStatusService;
    }


    public List<MonthlyStatement> getLastSixMonthsStatements(final CreditCardRecordsDTO record) {
        List<MonthlyStatement> monthlyStatements = new ArrayList<>();
        monthlyStatements.add(getMonthlyStatement(record.getBillAmount1(), record.getPayAmount1(), record.getPay0()));
        monthlyStatements.add(getMonthlyStatement(record.getBillAmount2(), record.getPayAmount2(), record.getPay2()));
        monthlyStatements.add(getMonthlyStatement(record.getBillAmount3(), record.getPayAmount3(), record.getPay3()));
        monthlyStatements.add(getMonthlyStatement(record.getBillAmount4(), record.getPayAmount4(), record.getPay4()));
        monthlyStatements.add(getMonthlyStatement(record.getBillAmount5(), record.getPayAmount5(), record.getPay5()));
        monthlyStatements.add(getMonthlyStatement(record.getBillAmount6(), record.getPayAmount6(), record.getPay6()));
        return monthlyStatements;
    }


    private MonthlyStatement getMonthlyStatement(final String billedAmount, final String previousAmount, final String repayStatus) {
        MonthlyStatement monthlyStatement = new MonthlyStatement();
        monthlyStatement.setId(count++);
        monthlyStatement.setBilledAmount(billedAmount);
        monthlyStatement.setPreviousAmount(previousAmount);
        RepaymentStatus repaymentStatus = repaymentStatusService.findById(Long.valueOf(repayStatus));
        monthlyStatement.setRepaymentStatus(repaymentStatus);
        return monthlyStatement;
    }

}
