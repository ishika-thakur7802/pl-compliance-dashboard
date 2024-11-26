package com.example.ishika.plcompliance.repositories;

import com.example.ishika.plcompliance.entities.ComplianceLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplianceLogRepository extends JpaRepository<ComplianceLog,Integer> {
}
