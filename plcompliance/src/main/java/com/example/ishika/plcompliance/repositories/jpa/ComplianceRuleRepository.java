package com.example.ishika.plcompliance.repositories.jpa;

import com.example.ishika.plcompliance.entities.jpa.ComplianceRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplianceRuleRepository extends JpaRepository<ComplianceRule,Integer> {
}
