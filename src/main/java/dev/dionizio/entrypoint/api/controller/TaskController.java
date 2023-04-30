package dev.dionizio.entrypoint.api.controller;


import dev.dionizio.entrypoint.api.dto.request.CreateTaskRequest;
import jakarta.validation.Valid;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/task")
@Produces(MediaType.APPLICATION_JSON)
public interface TaskController {
    @POST
    Response createTask(@Valid CreateTaskRequest createTaskRequest);

    @GET
    Response listAllTask();
}
