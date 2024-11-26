package com.example.ishika.plcompliance.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.UUID;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditLog {

    @Id
    private UUID log_id;
    private Integer user_id;
    private String action;
    private Instant timestamp;
}
