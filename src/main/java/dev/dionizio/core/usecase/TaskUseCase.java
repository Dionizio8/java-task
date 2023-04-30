package dev.dionizio.core.usecase;

import dev.dionizio.core.domain.Task;
import dev.dionizio.core.gateway.TaskGateway;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public record TaskUseCase(TaskGateway taskGateway) {
    public void create(final Task task) {
        taskGateway.save(task);
    }

    public List<Task> listAll(){ return taskGateway.findAll();}
}
