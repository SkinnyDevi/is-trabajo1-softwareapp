package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ProjectManager projMngr = new ProjectManager();
        init(projMngr);

        System.out.println(projMngr.getCustomer(0));
        System.out.println(projMngr.getEmployee(1));
        System.out.println();
        System.out.println(projMngr.getCustomer(0).getProject(0));
        System.out.println();
        for (Task t : projMngr.getCustomer(0).getProject(0).allTasks()) {
            System.out.println(t);
            System.out.println();
        }

        System.out.println("Numero de clientes: " + projMngr.customerCount());
        projMngr.removeCustomer(1);
        System.out.println("Numero de clientes: " + projMngr.customerCount());
    }

    public static void init(ProjectManager projectManager) {
        projectManager.addCustomer("Juan", "Santana", new Phone("854726"));
        projectManager.addCustomer("Felix", "Velasquez", new Phone("993935993"));

        projectManager.addEmployee("Estefania", "est.adiuad@gmail.com");
        projectManager.addEmployee("Rumilda", "ru.milda@gmail.com");

        projectManager.project(
                "App poyecto 1",
                "primer proyecto de empresa",
                ProjectType.WEB_DEVELOPMENT,
                projectManager.getCustomer(0)
        );

        Project projectOfFirstCustomer = projectManager.getCustomer(0).getProject(0);

        projectOfFirstCustomer.setManager(projectManager.getEmployee(1));

        projectOfFirstCustomer.addTask(
                "Tarea 1",
                "iniciar proyecto",
                new Date("04/02/2023"),
                new Date("04/02/2024"), TaskType.Programming
        );
        projectOfFirstCustomer.addEffortToTask(projectManager.getEmployee(0), 0, 3);

        projectOfFirstCustomer.addTask(
                "Tarea 2",
                "analizar proyecto",
                new Date("08/02/2023"),
                new Date("10/03/2023"),
                TaskType.Analysis
        );
        projectOfFirstCustomer.addEffortToTask(projectManager.getEmployee(0), 1,8);
    }
}
