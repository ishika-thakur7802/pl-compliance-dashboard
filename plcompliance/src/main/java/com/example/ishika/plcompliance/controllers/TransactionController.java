package com.example.ishika.plcompliance.controllers;

import com.example.ishika.plcompliance.entities.jpa.Transaction;
import com.example.ishika.plcompliance.repositories.jpa.TransactionRepository;
import com.example.ishika.plcompliance.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @Autowired
    private final TransactionService transactionService;

    @Autowired
    private final TransactionRepository transactionRepository;

    public TransactionController(TransactionService transactionService, TransactionRepository transactionRepository) {
        this.transactionService = transactionService;
        this.transactionRepository = transactionRepository;
    }

    @GetMapping("/home")
    public String home() {return "Welcome to the dashboard!";}

    @PostMapping("/api/transactions")
    public void addTransaction(@RequestBody Transaction transaction) {
         transactionService.addTransaction(transaction);
    }

    @GetMapping("/api/netPL")
    public double calculateNetPL()
    {
        return transactionService.calculateNetPL();
    }




}
