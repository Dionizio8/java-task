package dev.dionizio.dataprovider.database.repository;

import dev.dionizio.dataprovider.database.entity.TaskEntity;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TaskRepository implements PanacheMongoRepository<TaskEntity> {
}
