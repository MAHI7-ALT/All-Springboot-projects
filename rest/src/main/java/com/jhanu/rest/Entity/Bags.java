package com.jhanu.rest.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bags {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bagNo;
    private String bagName;
    private Long bagQty;
    private long bagPrice;


    public Bags() {
    }

    public Bags(int bagNo, String bagName, Long bagQty, long bagPrice) {
        this.bagNo = bagNo;
        this.bagName = bagName;
        this.bagQty = bagQty;
        this.bagPrice = bagPrice;
    }

    public int getBagNo() {
        return this.bagNo;
    }

    public void setBagNo(int bagNo) {
        this.bagNo = bagNo;
    }

    public String getBagName() {
        return this.bagName;
    }

    public void setBagName(String bagName) {
        this.bagName = bagName;
    }

    public Long getBagQty() {
        return this.bagQty;
    }

    public void setBagQty(Long bagQty) {
        this.bagQty = bagQty;
    }

    public long getBagPrice() {
        return this.bagPrice;
    }

    public void setBagPrice(long bagPrice) {
        this.bagPrice = bagPrice;
    }


    @Override
    public String toString() {
        return "{" +
            " bagNo='" + getBagNo() + "'" +
            ", bagName='" + getBagName() + "'" +
            ", bagQty='" + getBagQty() + "'" +
            ", bagPrice='" + getBagPrice() + "'" +
            "}";
    }
    


    
}
