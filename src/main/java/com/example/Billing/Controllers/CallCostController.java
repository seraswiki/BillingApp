package com.example.Billing.Controllers;

import com.example.Billing.DTOs.CallCostRequestDTO;
import com.example.Billing.DTOs.CallCostResponseDTO;
import com.example.Billing.Services.CallCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CallCostController {

    @Autowired
    CallCostService callCostService;

    @PostMapping("/ ")
    public ResponseEntity<CallCostResponseDTO> upsertCall(@RequestBody CallCostRequestDTO callRequest) {
        ResponseEntity<CallCostResponseDTO> callResponse = new ResponseEntity<CallCostResponseDTO>(callCostService.upsertCall(callRequest),
                HttpStatus.CREATED);
        return  callResponse;
    }

    @GetMapping("/callcost")
    public ResponseEntity<ArrayList<CallCostResponseDTO>> listCall() {
        ArrayList<CallCostResponseDTO> res = callCostService.listCall();
        ResponseEntity<ArrayList<CallCostResponseDTO>> callListResponse = new ResponseEntity<ArrayList<CallCostResponseDTO>>(res,
                HttpStatus.ACCEPTED);

        return callListResponse;
    }

}
