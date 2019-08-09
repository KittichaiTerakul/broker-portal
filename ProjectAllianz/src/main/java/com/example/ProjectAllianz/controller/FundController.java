package com.example.ProjectAllianz.controller;


import com.example.ProjectAllianz.model.Funds;
import com.example.ProjectAllianz.repository.FundRepository;
import com.example.ProjectAllianz.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FundController  {

    @Autowired
    private FundService fundService;
    @GetMapping(value="/fund/all")
    public List<Funds> getAll(){
        return fundService.getAllFunds();
    }

    @PostMapping(value = "/funds/create")
    public List<Funds> createFund (@RequestBody Funds funds){
        fundService.addFunds(funds);
        return fundService.getAllFunds();
    }

    @GetMapping public List<Funds> findFundsByBookId(@RequestParam(required = false, defaultValue = "0") int bookId) {
        if (bookId == 0 ) {
            return fundService.getAllFunds();
        } return fundService.getFundByCustomerId(bookId);    }


}
