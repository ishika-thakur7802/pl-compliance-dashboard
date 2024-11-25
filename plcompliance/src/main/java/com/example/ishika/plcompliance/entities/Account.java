package com.example.ishika.plcompliance.entities;

import com.example.ishika.plcompliance.enums.account_type_enum;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @ColumnDefault("nextval('accounts_acc_id_seq'::regclass)")
    @Column(name = "acc_id", nullable = false)
    private Integer id;

    @Column(name = "acc_name", nullable = false)
    private String accName;

    @ColumnDefault("0.00")
    @Column(name = "balance", precision = 15, scale = 2)
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    @Column(name = "acc_type", columnDefinition = "account_type_enum not null")
    private account_type_enum accType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public account_type_enum getAccType() {
        return accType;
    }
    public void setAccType(account_type_enum accType) {
        this.accType = accType;
    }
}