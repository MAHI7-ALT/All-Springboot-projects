package com.mahendra.springJpaAssigment.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sales{

@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
    private long  invNo;
    private Date transDate;
    private int qty;
    private long amount;
@ManyToOne
@JoinColumn(name="productId")
    private Product product;



    public Sales() {
    }

    public Sales( Date transDate, int qty, long amount, Product product) {
       
        this.transDate = transDate;
        this.qty = qty;
        this.amount = amount;
        this.product = product;
    }

    public long getInvNo() {
        return this.invNo;
    }

    public Date getTransDate() {
        return this.transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "{" +
            " invNo='" + getInvNo() + "'" +
            ", transDate='" + getTransDate() + "'" +
            ", qty='" + getQty() + "'" +
            ", amount='" + getAmount() + "'" +
            ", product='" + getProduct() + "'" +
            "}";
    }


}

