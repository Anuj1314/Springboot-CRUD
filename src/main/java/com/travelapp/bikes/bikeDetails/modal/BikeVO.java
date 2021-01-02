package com.travelapp.bikes.bikeDetails.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "bikes")
public class BikeVO {

    @Id
    private Integer cno;

    @Field
    String companyName;

    @Field
    String bikeName;

    @Field
    String color;

    @Field
    String soldBySeller;

    @Field
    Integer sellerId;

    @Field
    Date createdAt;

    @Field
    Date updatedAt;

    public BikeVO() {
    }

    public BikeVO(Integer cno, String companyName, String bikeName, String color, String soldBySeller, Integer sellerId, Date createdAt, Date updatedAt) {
        this.cno = cno;
        this.companyName = companyName;
        this.bikeName = bikeName;
        this.color = color;
        this.soldBySeller = soldBySeller;
        this.sellerId = sellerId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public BikeVO(Integer cno, String companyName, String bikeName, String color, String soldBySeller, Integer sellerId, Date createdAt) {
        this.cno = cno;
        this.companyName = companyName;
        this.bikeName = bikeName;
        this.color = color;
        this.soldBySeller = soldBySeller;
        this.sellerId = sellerId;
        this.createdAt = createdAt;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String company) {
        this.companyName = company;
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

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "BikeVO{" +
                "cno=" + cno +
                ", companyName='" + companyName + '\'' +
                ", bikeName='" + bikeName + '\'' +
                ", color='" + color + '\'' +
                ", soldBySeller='" + soldBySeller + '\'' +
                ", sellerId=" + sellerId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
