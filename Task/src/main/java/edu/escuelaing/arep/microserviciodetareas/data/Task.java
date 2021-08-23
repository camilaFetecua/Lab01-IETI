package edu.escuelaing.arep.microserviciodetareas.data;

import edu.escuelaing.arep.microserviciodetareas.dto.TaskDto;
import edu.escuelaing.arep.microserviciodetareas.dto.UserDto;
import org.graalvm.compiler.lir.LIRInstruction;

import java.util.UUID;

public class Task {
    private String id;
    private String name;
    private String description;
    private Enum status;
    private User assignedTo;
    private String dueDate;
    private String created;


    public Task(TaskDto taskDto) {
        this.id = UUID.randomUUID().toString();
        this.name = taskDto.getName();
        this.description = taskDto.getDescription();
        this.status = (Enum) taskDto.getStatus();
        this.assignedTo= new User(taskDto.getAssignedTo());
        this.dueDate = taskDto.getDueDate();
        this.created = taskDto.getCreated();
    }

    public Task(String id, TaskDto taskDto) {
        this.id = id;
        this.name = taskDto.getName();
        this.description = taskDto.getDescription();
        this.status = (Enum) taskDto.getStatus();
        this.assignedTo = new User(taskDto.getAssignedTo());
        this.dueDate = taskDto.getDueDate();
        this.created = taskDto.getCreated();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
