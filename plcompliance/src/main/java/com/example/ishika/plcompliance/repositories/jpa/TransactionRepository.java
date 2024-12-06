package com.example.ishika.plcompliance.repositories.jpa;

import com.example.ishika.plcompliance.entities.jpa.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
