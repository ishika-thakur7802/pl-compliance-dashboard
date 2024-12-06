package com.example.ishika.plcompliance.entities.jpa;

import com.example.ishika.plcompliance.enums.log_status_enum;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "compliance_logs")
public class ComplianceLog {
    @Id
    @ColumnDefault("nextval('compliance_logs_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rule_id", nullable = false)
    private ComplianceRule rule;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "transaction_id", nullable = false)
    private Transaction transaction;

    @Column(name = "log_time", nullable = false)
    private Instant logTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private log_status_enum status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ComplianceRule getRule() {
        return rule;
    }

    public void setRule(ComplianceRule rule) {
        this.rule = rule;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Instant getLogTime() {
        return logTime;
    }

    public void setLogTime(Instant logTime) {
        this.logTime = logTime;
    }

    public log_status_enum getStatus() {
        return status;
    }

    public void setStatus(log_status_enum status) {
        this.status = status;
    }


}