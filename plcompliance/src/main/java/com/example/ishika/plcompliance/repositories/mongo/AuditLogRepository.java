package com.example.ishika.plcompliance.repositories.mongo;

import com.example.ishika.plcompliance.entities.mongo.AuditLog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface AuditLogRepository extends MongoRepository<AuditLog, UUID> {

}
