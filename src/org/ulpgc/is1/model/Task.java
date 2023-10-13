package org.ulpgc.is1.model;

import java.util.Date;

public class Task {

    public String name, description;
    public Date start, end;

    Effort effort;

    TaskType type;

    public Task(String name, String description, Date start, Date end, TaskType type) {
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
        this.type = type;
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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public void addEffort(Employee employee, int amount){
        this.effort =  new Effort(employee, this, amount);
    }

}
