package dev.dionizio.core.gateway;

import dev.dionizio.core.domain.Task;

public interface TaskGateway {

    void save(Task task);
}
