package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private static int NEXT_ID = 0;
    public final int id;
    public String name, description;
    public ProjectType type;

    // private List<Task> projectTasks = new ArrayList<>();

    public Project(String name, String description, ProjectType type) {
        this.id = NEXT_ID++;
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public void addTask() {}

    public int getId() {
        return id;
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

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }
}
