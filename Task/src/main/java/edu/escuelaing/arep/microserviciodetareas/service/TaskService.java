package edu.escuelaing.arep.microserviciodetareas.service;

import edu.escuelaing.arep.microserviciodetareas.data.Task;
import edu.escuelaing.arep.microserviciodetareas.dto.TaskDto;

import java.util.List;

public interface TaskService {
    Task create(TaskDto taskDto );

    Task findById( String id );

    List<Task> all();

    Boolean deleteById( String id );

    Task update( TaskDto taskDto, String id );
}
