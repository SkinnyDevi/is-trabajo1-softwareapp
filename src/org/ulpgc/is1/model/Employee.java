package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Employee {

    public String name, email;

    private ArrayList<Project> employeeProjects = new ArrayList<>();

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addProject(Project project) {
        this.employeeProjects.add(project);
    }

    public void removeProject(Project project) {
        this.employeeProjects.remove(project);
    }



}
