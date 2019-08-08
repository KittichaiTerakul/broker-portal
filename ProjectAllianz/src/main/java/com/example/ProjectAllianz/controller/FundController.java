package com.example.ProjectAllianz.controller;


import com.example.ProjectAllianz.model.Funds;
import com.example.ProjectAllianz.repository.FundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FundController  {

    @Autowired
    private FundRepository fundRepository;

    @GetMapping(value="/fund/all")
    public List<Funds> getAll(){
        return fundRepository.findAll();

    }

    @PostMapping(value = "/funds/create")
    public List<Funds> createFund (@RequestBody Funds funds){
        fundRepository.save(funds);
        return fundRepository.findAll();

    }

}
