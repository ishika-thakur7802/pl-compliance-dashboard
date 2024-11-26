package com.example.ishika.plcompliance.repositories;

import com.example.ishika.plcompliance.entities.ComplianceRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplianceRuleRepository extends JpaRepository<ComplianceRule,Integer> {
}
