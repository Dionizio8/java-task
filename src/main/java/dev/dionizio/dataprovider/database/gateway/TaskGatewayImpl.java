package dev.dionizio.dataprovider.database.gateway;

import dev.dionizio.core.domain.Task;
import dev.dionizio.core.gateway.TaskGateway;
import dev.dionizio.dataprovider.database.entity.TaskEntity;
import dev.dionizio.dataprovider.database.repository.TaskRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class TaskGatewayImpl implements TaskGateway {

    @Inject
    TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll().stream().map(
                entity -> Task.builder()
                        .title(entity.getTitle())
                        .description(entity.getDescription())
                        .status(entity.getStatus())
                        .build()).collect(Collectors.toList());
    }

    @Override
    public void save(Task task) {
        TaskEntity taskEntity = TaskEntity.builder()
                .title(task.getTitle())
                .description(task.getDescription())
                .status(task.getStatus())
                .build();

        taskRepository.persist(taskEntity);
    }
}
