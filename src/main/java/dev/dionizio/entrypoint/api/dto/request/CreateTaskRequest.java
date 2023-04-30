package dev.dionizio.entrypoint.api.dto.request;

import dev.dionizio.core.domain.Task;
import dev.dionizio.core.domain.TaskStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateTaskRequest(
        @NotNull
        String title,

        @NotNull
        String description
) {
    public Task toDomain(TaskStatus status) {
        return Task.builder()
                .title(title)
                .description(description)
                .status(status)
                .build();
    }
}
