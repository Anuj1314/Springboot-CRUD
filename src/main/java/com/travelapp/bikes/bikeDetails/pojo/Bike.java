package com.travelapp.bikes.bikeDetails.pojo;

import java.util.Date;

public class Bike {
    int cNo;
    String companyName;
    String bikeName;
    String color;

    String soldBySeller;
    Date cretedAt;
    Date updatedAt;


    public Bike() {
    }

    public Bike(int cNo, String companyName, String bikeName, String color, String soldBySeller, Date cretedAt, Date updatedAt) {
        this.cNo = cNo;
        this.companyName = companyName;
        this.bikeName = bikeName;
        this.color = color;
        this.soldBySeller = soldBySeller;
        this.cretedAt = cretedAt;
        this.updatedAt = updatedAt;
    }

    public Bike(int cNo, String companyName, String bikeName, String color, String soldBySeller) {
        this.cNo = cNo;
        this.companyName = companyName;
        this.bikeName = bikeName;
        this.color = color;
        this.soldBySeller = soldBySeller;
    }

    public int getcNo() {
        return cNo;
    }

    public void setcNo(int cNo) {
        this.cNo = cNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSoldBySeller() {
        return soldBySeller;
    }

    public void setSoldBySeller(String soldBySeller) {
        this.soldBySeller = soldBySeller;
    }

    public Date getCretedAt() {
        return cretedAt;
    }

    public void setCretedAt(Date cretedAt) {
        this.cretedAt = cretedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "cNo=" + cNo +
                ", companyName='" + companyName + '\'' +
                ", bikeName='" + bikeName + '\'' +
                ", color='" + color + '\'' +
                ", soldBySeller='" + soldBySeller + '\'' +
                ", cretedAt=" + cretedAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
