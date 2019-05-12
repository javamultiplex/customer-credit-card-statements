package com.manthan.cc.entity;

import javax.persistence.*;

@Entity
@Table(name = "MONTHLY_STATEMENT")
public class MonthlyStatement {

    @Id
    @Column(name = "ID")
    private Long id;

    @OneToOne(cascade={CascadeType.REMOVE,CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.DETACH})
    @JoinColumn(name = "REPAYMENT_STATUS")
    private RepaymentStatus repaymentStatus;

    @Column(name = "BILLED_AMOUNT")
    private String billedAmount;

    @Column(name = "PREVIOUS_AMOUNT")
    private String previousAmount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RepaymentStatus getRepaymentStatus() {
        return repaymentStatus;
    }

    public void setRepaymentStatus(RepaymentStatus repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
    }

    public String getBilledAmount() {
        return billedAmount;
    }

    public void setBilledAmount(String billedAmount) {
        this.billedAmount = billedAmount;
    }

    public String getPreviousAmount() {
        return previousAmount;
    }

    public void setPreviousAmount(String previousAmount) {
        this.previousAmount = previousAmount;
    }
}
