package com.example.ProjectAllianz.repository;

import com.example.ProjectAllianz.model.Funds;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FundRepository extends JpaRepository<Funds,Integer> {


    List<Funds> findFundsByCustomerId(int CustomerId);
}
