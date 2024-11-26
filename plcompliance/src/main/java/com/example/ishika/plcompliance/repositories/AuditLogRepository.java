package com.example.ishika.plcompliance.repositories;

import com.example.ishika.plcompliance.entities.AuditLog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface AuditLogRepository extends MongoRepository<AuditLog, UUID> {

}
