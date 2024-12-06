package com.example.ishika.plcompliance.services;

import com.example.ishika.plcompliance.entities.jpa.Transaction;
import com.example.ishika.plcompliance.repositories.jpa.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService implements TransactionServiceInterface{
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Transaction transaction) {
        transactionRepository.delete(transaction);
    }

    @Override
    public double calculateNetPL(){
        return transactionRepository.findAll().stream().mapToDouble(Transaction::getAmount).sum();
    }
}
