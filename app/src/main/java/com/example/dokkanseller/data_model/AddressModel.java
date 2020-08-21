package com.example.dokkanseller.data_model;

import java.io.Serializable;

public class AddressModel implements Serializable {
    public String customerID , customerName , customerAddress ,  customerCountry , customerNumber;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public AddressModel() {
    }

    public AddressModel(String customerName, String customerAddress, String customerCountry, String customerNumber) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerCountry = customerCountry;
        this.customerNumber = customerNumber;
    }
}
