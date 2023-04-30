package dev.dionizio.core.gateway;

import dev.dionizio.core.domain.Task;

import java.util.List;

public interface TaskGateway {
    void save(Task task);

    List<Task> findAll();
}
