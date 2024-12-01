package com.example.ishika.plcompliance.services;

import com.example.ishika.plcompliance.entities.Transaction;

import java.math.BigDecimal;
import java.util.List;

public interface TransactionServiceInterface {
    void addTransaction(Transaction transaction);
    void deleteTransaction(Transaction transaction);
    double calculateNetPL();
}
