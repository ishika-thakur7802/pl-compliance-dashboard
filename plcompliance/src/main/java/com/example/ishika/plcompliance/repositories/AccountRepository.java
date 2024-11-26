package com.example.ishika.plcompliance.repositories;

import com.example.ishika.plcompliance.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {
}
