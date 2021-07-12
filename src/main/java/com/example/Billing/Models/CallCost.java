package com.example.Billing.Models;

import com.example.Billing.DTOs.CallCostRequestDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CallCost {

    private @Id @GeneratedValue int id;
    private String mobileNumber;
    private int callDurationInSeconds;
    private String dateTime;
    private int customerId;

    public CallCost(CallCostRequestDTO callCostRequest) {
        this.mobileNumber = callCostRequest.mobileNumber;
        this.callDurationInSeconds = callCostRequest.callDurationInSeconds;
        this.dateTime = callCostRequest.dateTime;
        this.customerId = callCostRequest.customerId;
    }

    public CallCost() {

    }

    public int getId() {
        return id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getCallDurationInSeconds() {
        return callDurationInSeconds;
    }

    public String getDateTime() {
        return dateTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setCallDurationInSeconds(int callDurationInSeconds) {
        this.callDurationInSeconds = callDurationInSeconds;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

}
