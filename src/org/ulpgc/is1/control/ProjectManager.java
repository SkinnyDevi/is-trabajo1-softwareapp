package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;

public class ProjectManager {
    ArrayList<Customer> customers =  new ArrayList<>();
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Project> projects = new ArrayList<>();

    public void project(String name, String description, ProjectType type, Customer customer) {
        Project newProject = new Project(name, description, type, customer);
        if (Utilities.checkProjectExists(newProject, this.projects)) {
            System.out.println("Ya existe un proyecto con este nombre");
            return;
        }

        for (Employee e : this.employees) {
            newProject.addEmployee(e);
        }
        this.projects.add(newProject);
    }

    public void addCustomer(String name, String surname, Phone phone){
        Customer newCustomer = new Customer(name, surname, phone);
        if (Utilities.checkCustomerExists(newCustomer, this.customers)) {
            System.out.println("Ya existe un cliente con este nombre");
            return;
        }

        this.customers.add(newCustomer);
    }

    public Customer getCustomer(int index){
        return this.customers.get(index);
    }

    public void addEmployee(String name, String email ) {
        Employee newEmployee = new Employee(name, email);
        if (Utilities.checkEmployeeExists(newEmployee, this.employees)) {
            System.out.println("Ya existe un empleado con este nombre");
            return;
        }

        this.employees.add(newEmployee);
    }

    public Employee getEmployee(int index) {
        return this.employees.get(index);
    }

    public void removeEmployee(int index) {
        this.employees.remove(index);
    }

    public void removeCustomer(int index) {
        this.customers.remove(index);
    }

    public int customerCount() {
        return this.customers.size();
    }
}
