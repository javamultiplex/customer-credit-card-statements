package com.manthan.cc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEFAULT_PAYMENT")
public class DefaultPayment {

    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "VALUE")
    private String value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
