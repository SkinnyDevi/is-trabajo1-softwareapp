package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String name, surname;
    public Phone phone;

    private List<Project> customerProjects = new ArrayList<>();

    public Customer(String name, String surname, Phone phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Project getProject(int index) {
        return this.customerProjects.get(index);
    }

    public void addProject(Project project) {
        this.customerProjects.add(project);
    }
}
