package com.example.ishika.plcompliance.repositories;

import com.example.ishika.plcompliance.entities.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert,Integer> {
}
