package com.example.Billing.Services;

import com.example.Billing.DTOs.CallCostRequestDTO;
import com.example.Billing.DTOs.CallCostResponseDTO;
import com.example.Billing.Models.CallCost;
import com.example.Billing.Repositories.CallCostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

@Service
public class CallCostService {

    @Autowired
    CallCostRepository callCostRepository;

    public CallCostResponseDTO upsertCall(CallCostRequestDTO callCostRequest) {

        CallCost callCost = callCostRepository.save(new CallCost(callCostRequest));
        CallCostResponseDTO callCostResponseDTO = new CallCostResponseDTO();

        callCostResponseDTO.customerId = callCost.getCustomerId();
        callCostResponseDTO.mobileNumber = callCost.getMobileNumber();
        callCostResponseDTO.customerId = callCost.getCustomerId();
        callCostResponseDTO.dateTime = callCost.getDateTime();
        callCostResponseDTO.id = callCost.getId();

        return callCostResponseDTO;
    }
    
    public ArrayList<CallCostResponseDTO> listCall() {
        List<CallCost> allCalls = callCostRepository.findAll();

        ArrayList<CallCostResponseDTO> callList = new ArrayList<CallCostResponseDTO>();
        for (CallCost call:allCalls) {
            callList.add(new CallCostResponseDTO(call));
        }

        /*ArrayList<CallCostResponseDTO> callList2 = allCalls.stream()
                .map(c -> new CallCostResponseDTO(c))
                .collect(Collectors.toList())
                .toArray();*/

        return callList;
    }

}
