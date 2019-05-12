package com.manthan.cc.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LIMIT_BALANCE")
    private String ccLimit;

    @Column(name = "AGE")
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SEX")
    private Gender gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EDUCATION")
    private Education education;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MARRIAGE")
    private Marriage marriage;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DEFAULT_PAYMENT")
    private DefaultPayment defaultPayment;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_ID")
    private List<MonthlyStatement> monthlyStatements;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCcLimit() {
        return ccLimit;
    }

    public void setCcLimit(String ccLimit) {
        this.ccLimit = ccLimit;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Marriage getMarriage() {
        return marriage;
    }

    public void setMarriage(Marriage marriage) {
        this.marriage = marriage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DefaultPayment getDefaultPayment() {
        return defaultPayment;
    }

    public void setDefaultPayment(DefaultPayment defaultPayment) {
        this.defaultPayment = defaultPayment;
    }

    public List<MonthlyStatement> getMonthlyStatements() {
        return monthlyStatements;
    }

    public void setMonthlyStatements(List<MonthlyStatement> monthlyStatements) {
        this.monthlyStatements = monthlyStatements;
    }
}
