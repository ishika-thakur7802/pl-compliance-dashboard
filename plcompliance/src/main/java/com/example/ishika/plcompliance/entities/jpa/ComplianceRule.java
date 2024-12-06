package com.example.ishika.plcompliance.entities.jpa;

import com.example.ishika.plcompliance.enums.compliance_severity_enum;
import com.example.ishika.plcompliance.enums.compliance_status_enum;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "compliance_rules")
public class ComplianceRule {
    @Id
    @ColumnDefault("nextval('compliance_rules_rule_id_seq'::regclass)")
    @Column(name = "rule_id", nullable = false)
    private Integer id;

    @Column(name = "rule_name", nullable = false, length = 250)
    private String ruleName;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private compliance_status_enum status;

    @Enumerated(EnumType.STRING)
    @Column(name = "severity", nullable = false)
    private compliance_severity_enum severity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public compliance_status_enum getStatus() {
        return status;
    }

    public void setStatus(compliance_status_enum status) {
        this.status = status;
    }

    public compliance_severity_enum getSeverity() {
        return severity;
    }

    public void setSeverity(compliance_severity_enum severity) {
        this.severity = severity;
    }
}