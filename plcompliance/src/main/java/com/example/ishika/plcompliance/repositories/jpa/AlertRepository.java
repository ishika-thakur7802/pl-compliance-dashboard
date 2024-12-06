package com.example.ishika.plcompliance.repositories.jpa;

import com.example.ishika.plcompliance.entities.jpa.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert,Integer> {
}
