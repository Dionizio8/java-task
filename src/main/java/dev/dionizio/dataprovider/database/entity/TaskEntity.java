package dev.dionizio.dataprovider.database.entity;

import dev.dionizio.core.domain.TaskStatus;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.*;
import org.bson.types.ObjectId;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@MongoEntity(collection = "task")
public class TaskEntity {
    private ObjectId id;
    private String title;
    private String description;
    private TaskStatus status;
}
