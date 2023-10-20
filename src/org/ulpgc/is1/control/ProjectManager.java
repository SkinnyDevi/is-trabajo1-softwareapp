package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    ArrayList <Customer> customers =  new ArrayList<>();
    ArrayList<Employee> employees = new ArrayList<>();

    public Project project(String name, String description, ProjectType type, Customer customer){
        return  new Project(name, description, type, customer);
    }

    public void addCustomer(String name, String surname, Phone phone){
        this.customers.add(new Customer(name, surname, phone));
    }

    public Customer getCustomer(int index){
        return this.customers.get(index);
    }

    public void  addEmployee(String name, String email ){
        this.employees.add(new Employee(name, email));
    }

    public Employee getEmployee(int index){
        return this.employees.get(index);
    }
}
