package com.mahendra.springJpaAssigment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class Product{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodId;
    private String prodName;
    private double price;
    private int qty;
    private String remarks;
    private String catCode; 


    public Product() {
    }

    public Product(int prodId, String prodName, double price, int qty, String remarks, String catCode) {
      this.prodId=prodId;
        this.prodName = prodName;
        this.price = price;
        this.qty = qty;
        this.remarks = remarks;
        this.catCode = catCode;
    }

    public int getProdId() {
        return this.prodId;
    }
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return this.prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCatCode() {
        return this.catCode;
    }

    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    @Override
    public String toString() {
        return "{" +
            " prodId='" + getProdId() + "'" +
            ", prodName='" + getProdName() + "'" +
            ", price='" + getPrice() + "'" +
            ", qty='" + getQty() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", catCode='" + getCatCode() + "'" +
            "}";
    }

}