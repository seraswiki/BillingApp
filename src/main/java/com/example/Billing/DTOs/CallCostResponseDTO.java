package com.example.Billing.DTOs;

import com.example.Billing.Models.CallCost;

public class CallCostResponseDTO extends CallCostRequestDTO {

    public int id;

    public CallCostResponseDTO () {}

    public CallCostResponseDTO(CallCost call) {
        super();
        id = call.getId();
        customerId = call.getCustomerId();
        mobileNumber = call.getMobileNumber();
        callDurationInSeconds = call.getCallDurationInSeconds();
        dateTime = call.getDateTime();
    }
}
