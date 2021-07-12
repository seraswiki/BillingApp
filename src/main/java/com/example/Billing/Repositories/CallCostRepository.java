package com.example.Billing.Repositories;

import com.example.Billing.Models.CallCost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallCostRepository extends JpaRepository<CallCost, Integer> {
}
