package com.example.ishika.plcompliance.repositories.jpa;

import com.example.ishika.plcompliance.entities.jpa.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {
}
