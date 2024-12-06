package com.example.ishika.plcompliance.entities.jpa;

import com.example.ishika.plcompliance.enums.alert_type_enum;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "alerts")
public class Alert {
    @Id
    @ColumnDefault("nextval('alerts_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "alert_message", nullable = false, length = Integer.MAX_VALUE)
    private String alertMessage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "alert_time", nullable = false)
    private Instant alertTime;
    @Column(name = "resolved")
    private Boolean resolved;

    @Enumerated(EnumType.STRING) // Or EnumType.ORDINAL, depending on how the DB stores it
    @Column(name = "alert_type", nullable = false)
    private alert_type_enum alert_type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Instant getAlertTime() {
        return alertTime;
    }

    public void setAlertTime(Instant alertTime) {
        this.alertTime = alertTime;
    }

    public Boolean getResolved() {
        return resolved;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    public alert_type_enum getAlert_type(){return alert_type;}

    public void setAlert_type(alert_type_enum alert_type) {
        this.alert_type = alert_type;
    }

}