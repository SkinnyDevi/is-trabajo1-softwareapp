package org.ulpgc.is1.model;

public class Effort {
    Employee employee;
    Task task;
    public int aumount;

    public Effort(Employee employee, Task task, int aumount) {
        this.employee = employee;
        this.task = task;
        this.aumount = aumount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public int getAumount() {
        return aumount;
    }

    public void setAumount(int aumount) {
        this.aumount = aumount;
    }
}
