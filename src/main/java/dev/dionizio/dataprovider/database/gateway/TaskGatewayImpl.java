package dev.dionizio.dataprovider.database.gateway;

import dev.dionizio.core.domain.Task;
import dev.dionizio.core.gateway.TaskGateway;
import dev.dionizio.dataprovider.database.entity.TaskEntity;
import dev.dionizio.dataprovider.database.repository.TaskRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TaskGatewayImpl implements TaskGateway {

    @Inject
    TaskRepository taskRepository;
    @Override
    public void save(Task task) {
        TaskEntity taskEntity = TaskEntity.builder()
                .name(task.getName())
                .build();

        taskRepository.persist(taskEntity);
    }
}
