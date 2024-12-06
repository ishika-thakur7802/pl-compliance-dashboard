package com.example.ishika.plcompliance.repositories.jpa;

import com.example.ishika.plcompliance.entities.jpa.ComplianceLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplianceLogRepository extends JpaRepository<ComplianceLog,Integer> {
}
