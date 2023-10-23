package org.ulpgc.is1.model;

import java.util.List;

public class Utilities {
    public static boolean checkProjectExists(Project project, List<Project> projectList) {
        for (Project currentProject : projectList) {
            if (currentProject.name.equals(project.name)) return true;
        }

        return false;
    }

    public static boolean checkEmployeeExists(Employee employee, List<Employee> employeeList) {
        for (Employee emp : employeeList) {
            if (emp.name.equals(employee.name)) return true;
        }

        return false;
    }

    public static boolean checkTaskExists(Task task, List<Task> taskList) {
        for (Task existingTask : taskList) {
            if (existingTask.name.equals(task.name)) return true;
        }

        return false;
    }

    public static boolean checkCustomerExists(Customer customer, List<Customer> taskList) {
        for (Customer existingCustomer : taskList) {
            if (existingCustomer.name.equals(customer.name)) return true;
        }

        return false;
    }
}
