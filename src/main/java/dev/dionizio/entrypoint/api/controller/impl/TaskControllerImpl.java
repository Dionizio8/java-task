package dev.dionizio.entrypoint.api.controller.impl;

import dev.dionizio.core.domain.TaskStatus;
import dev.dionizio.core.usecase.TaskUseCase;
import dev.dionizio.entrypoint.api.controller.TaskController;
import dev.dionizio.entrypoint.api.dto.request.CreateTaskRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.*;
import jakarta.ws.rs.core.Response;


@ApplicationScoped
public class TaskControllerImpl implements TaskController {

    @Inject
    TaskUseCase taskUseCase;

    @Inject
    Validator validator;

    @Override
    public Response createTask(CreateTaskRequest createTaskRequest) {
        taskUseCase.create(createTaskRequest.toDomain(TaskStatus.IN_PROGRESS));
        return Response.ok().build();
    }

    @Override
    public Response listAllTask() {
        var tasks = taskUseCase.listAll();
        return Response.ok(tasks).build();
    }
}
