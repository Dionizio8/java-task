package dev.dionizio.entrypoint.api.controller.impl;

import dev.dionizio.core.usecase.TaskUseCase;
import dev.dionizio.entrypoint.api.controller.TaskController;
import dev.dionizio.entrypoint.api.dto.request.CreateTaskRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;


@ApplicationScoped
public class TaskControllerImpl implements TaskController {

    @Inject
    TaskUseCase taskUseCase;

    @Override
    public Response createTask(CreateTaskRequest createTaskRequest) {
        taskUseCase.save(createTaskRequest.toDomain());
        return Response.ok().build();
    }
}
