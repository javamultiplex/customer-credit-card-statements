package com.manthan.cc.dto;

import com.opencsv.bean.CsvBindByName;

public class CreditCardRecordsDTO {

    @CsvBindByName(column = "ID")
    private String id;
    @CsvBindByName(column = "Name")
    private String name;
    @CsvBindByName(column = "LIMIT_BAL")
    private String limitBalance;
    @CsvBindByName(column = "SEX")
    private String sex;
    @CsvBindByName(column = "EDUCATION")
    private String education;
    @CsvBindByName(column = "MARRIAGE")
    private String marriage;
    @CsvBindByName(column = "AGE")
    private String age;
    @CsvBindByName(column = "PAY_0")
    private String pay0;
    @CsvBindByName(column = "PAY_2")
    private String pay2;
    @CsvBindByName(column = "PAY_3")
    private String pay3;
    @CsvBindByName(column = "PAY_4")
    private String pay4;
    @CsvBindByName(column = "PAY_5")
    private String pay5;
    @CsvBindByName(column = "PAY_6")
    private String pay6;
    @CsvBindByName(column = "BILL_AMT1")
    private String billAmount1;
    @CsvBindByName(column = "BILL_AMT2")
    private String billAmount2;
    @CsvBindByName(column = "BILL_AMT3")
    private String billAmount3;
    @CsvBindByName(column = "BILL_AMT4")
    private String billAmount4;
    @CsvBindByName(column = "BILL_AMT5")
    private String billAmount5;
    @CsvBindByName(column = "BILL_AMT6")
    private String billAmount6;
    @CsvBindByName(column = "PAY_AMT1")
    private String payAmount1;
    @CsvBindByName(column = "PAY_AMT2")
    private String payAmount2;
    @CsvBindByName(column = "PAY_AMT3")
    private String payAmount3;
    @CsvBindByName(column = "PAY_AMT4")
    private String payAmount4;
    @CsvBindByName(column = "PAY_AMT5")
    private String payAmount5;
    @CsvBindByName(column = "PAY_AMT6")
    private String payAmount6;
    @CsvBindByName(column = "default.payment.next.month")
    private String defaultPayment;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLimitBalance() {
        return limitBalance;
    }

    public void setLimitBalance(String limitBalance) {
        this.limitBalance = limitBalance;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPay0() {
        return pay0;
    }

    public void setPay0(String pay0) {
        this.pay0 = pay0;
    }

    public String getPay2() {
        return pay2;
    }

    public void setPay2(String pay2) {
        this.pay2 = pay2;
    }

    public String getPay3() {
        return pay3;
    }

    public void setPay3(String pay3) {
        this.pay3 = pay3;
    }

    public String getPay4() {
        return pay4;
    }

    public void setPay4(String pay4) {
        this.pay4 = pay4;
    }

    public String getPay5() {
        return pay5;
    }

    public void setPay5(String pay5) {
        this.pay5 = pay5;
    }

    public String getPay6() {
        return pay6;
    }

    public void setPay6(String pay6) {
        this.pay6 = pay6;
    }

    public String getBillAmount1() {
        return billAmount1;
    }

    public void setBillAmount1(String billAmount1) {
        this.billAmount1 = billAmount1;
    }

    public String getBillAmount2() {
        return billAmount2;
    }

    public void setBillAmount2(String billAmount2) {
        this.billAmount2 = billAmount2;
    }

    public String getBillAmount3() {
        return billAmount3;
    }

    public void setBillAmount3(String billAmount3) {
        this.billAmount3 = billAmount3;
    }

    public String getBillAmount4() {
        return billAmount4;
    }

    public void setBillAmount4(String billAmount4) {
        this.billAmount4 = billAmount4;
    }

    public String getBillAmount5() {
        return billAmount5;
    }

    public void setBillAmount5(String billAmount5) {
        this.billAmount5 = billAmount5;
    }

    public String getBillAmount6() {
        return billAmount6;
    }

    public void setBillAmount6(String billAmount6) {
        this.billAmount6 = billAmount6;
    }

    public String getPayAmount1() {
        return payAmount1;
    }

    public void setPayAmount1(String payAmount1) {
        this.payAmount1 = payAmount1;
    }

    public String getPayAmount2() {
        return payAmount2;
    }

    public void setPayAmount2(String payAmount2) {
        this.payAmount2 = payAmount2;
    }

    public String getPayAmount3() {
        return payAmount3;
    }

    public void setPayAmount3(String payAmount3) {
        this.payAmount3 = payAmount3;
    }

    public String getPayAmount4() {
        return payAmount4;
    }

    public void setPayAmount4(String payAmount4) {
        this.payAmount4 = payAmount4;
    }

    public String getPayAmount5() {
        return payAmount5;
    }

    public void setPayAmount5(String payAmount5) {
        this.payAmount5 = payAmount5;
    }

    public String getPayAmount6() {
        return payAmount6;
    }

    public void setPayAmount6(String payAmount6) {
        this.payAmount6 = payAmount6;
    }

    public String getDefaultPayment() {
        return defaultPayment;
    }

    public void setDefaultPayment(String defaultPayment) {
        this.defaultPayment = defaultPayment;
    }
}
