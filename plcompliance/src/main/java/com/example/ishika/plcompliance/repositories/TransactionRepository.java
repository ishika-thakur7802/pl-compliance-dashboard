package com.example.ishika.plcompliance.repositories;

import com.example.ishika.plcompliance.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
