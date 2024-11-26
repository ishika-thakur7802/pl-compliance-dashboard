package com.example.ishika.plcompliance.repositories;

import com.example.ishika.plcompliance.entities.Account;
import com.example.ishika.plcompliance.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
