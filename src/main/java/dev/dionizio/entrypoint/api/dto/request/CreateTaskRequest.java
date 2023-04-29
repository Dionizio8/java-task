package dev.dionizio.entrypoint.api.dto.request;

import dev.dionizio.core.domain.Task;

public record CreateTaskRequest(
        String name
){
    public Task toDomain(){
        return Task.builder().name(name).build();
    }
}
