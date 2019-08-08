package com.example.ProjectAllianz.service;

import com.example.ProjectAllianz.model.Funds;
import com.example.ProjectAllianz.repository.FundRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FundService {

    @Autowired
    private FundRepository fundRepository;

    public List<Funds> getAllFunds(){
        return fundRepository.findAll();
    }

    public void addFunds(Funds funds){
        fundRepository.save(funds);
    }

    public List<Funds> getFundByCustomerId(int customerId){
        return fundRepository.findFundsByCustomerId(customerId);
    }

}
