package com.example.ishika.plcompliance.entities;

import com.example.ishika.plcompliance.enums.transaction_status;
import com.example.ishika.plcompliance.enums.transaction_type;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @ColumnDefault("nextval('transactions_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "transaction_date", nullable = false)
    private Instant transactionDate;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "description", length = 1000)
    private String description;

    @Enumerated(EnumType.STRING) // Or EnumType.ORDINAL, depending on how the DB stores it
    @Column(name = "status", nullable= false)
    private transaction_status status;

    @Enumerated(EnumType.STRING) // Or EnumType.ORDINAL, depending on how the DB stores it
    @Column(name = "type", nullable=false)
    private transaction_type type;

    @ColumnDefault("false")
    @Column(name = "reconciled")
    private Boolean reconciled;
    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "acc_id")
    private Account acc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Instant transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public transaction_status getStatus(){return status;}

    public void setStatus() { this.status=status; }

    public Boolean getReconciled() {
        return reconciled;
    }

    public void setReconciled(Boolean reconciled) {
        this.reconciled = reconciled;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public transaction_type getType()
    {
        return type;
    }

    public void setType(transaction_type type) {
        this.type = type;
    }
}