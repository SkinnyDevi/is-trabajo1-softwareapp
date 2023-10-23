package org.ulpgc.is1.model;

public class Effort {
    Employee employee;
    Task task;
    public int amount;

    public Effort(Employee employee, Task task, int amount) {
        this.employee = employee;
        this.task = task;
        this.amount = amount;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Empleado: " + this.employee.name + ", esfuerzo: " + this.amount +
                ", tarea: " + this.task.name;
    }
}
