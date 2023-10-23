package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private static int NEXT_ID = 0;
    public final int id;
    public String name, description;
    public ProjectType type;
    public Customer customer;

    private Employee manager = null;
    private Contract contract = null;
    private List<Employee> employees = new ArrayList<>();
    private List<Task> projectTasks = new ArrayList<>();

    public Project(String name, String description, ProjectType type, Customer customer) {
        this.id = NEXT_ID++;
        this.name = name;
        this.description = description;
        this.type = type;
        this.customer = customer;
        this.customer.addProject(this);
    }

    @Override
    public String toString() {
        return "Infomacion del proyecto: " + this.name + "\n" +
                "Descripcion: " + this.description + "\n" +
                "Tipo: " + this.type + "\n" +
                "Cliente: " + this.customer.toString() + "\n" +
                "Empleados: " + this.employees.toString() + "\n" +
                "Manager: " + this.manager.toString() + "\n" +
                "Tareas: " + this.projectTasks.size();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addTask(String name, String description, Date start, Date end, TaskType type) {
        Task newTask = new Task(name, description, start, end, type);
        if (Utilities.checkTaskExists(newTask, this.projectTasks)) {
            System.out.println("Ya existe una tarea con este proyecto");
            return;
        }

        this.projectTasks.add(newTask);
    }

    public void addEffortToTask(Employee employee, int taskIndex, int amount) {
        this.getTask(taskIndex).addEffort(employee, amount);
    }

    public Task getTask(int index) {
        return this.projectTasks.get(index);
    }

    public ArrayList<Task> allTasks() {
        return new ArrayList<>(this.projectTasks);
    }

    public Employee getEmployee(int index) {
        return this.employees.get(index);
    }

    public void addEmployee(Employee employee) {
        employee.addProject(this);
        this.employees.add(employee);
    }

    public void removeEmployee(int index) {
        Employee employee = this.employees.get(index);
        employee.removeProject(this);
        this.employees.remove(employee);
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void addContract(Date start, Date end, int budget) {
        this.contract = new Contract(start, end, budget);
    }

    public Contract getContract() {
        return contract;
    }

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
