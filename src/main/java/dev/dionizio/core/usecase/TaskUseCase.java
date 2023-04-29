package dev.dionizio.core.usecase;

import dev.dionizio.core.domain.Task;
import dev.dionizio.core.gateway.TaskGateway;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public record TaskUseCase(TaskGateway taskGateway) {
    public void save(final Task task) {
        taskGateway.save(task);
    }
}
