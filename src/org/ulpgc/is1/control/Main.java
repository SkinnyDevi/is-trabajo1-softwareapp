package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Phone;
import org.ulpgc.is1.model.Project;
import org.ulpgc.is1.model.ProjectType;
import org.ulpgc.is1.model.TaskType;

import java.util.Date;

public class Main {
    public static void main(String[] args) {




    }

    public void init( ProjectManager projectManager){
        projectManager.addCustomer("Juan", "Santana", new Phone("99393993"));
        projectManager.addCustomer("Felix", "Velasquez", new Phone("8383883"));

        projectManager.addEmployee("Estefania", "est.adiuad@gmail.com");
        projectManager.addEmployee("Juan Pablo", "juan.pablo@gmail.com");

        Project project = projectManager.project(
                "App de mierda",
                "Es una puta basura",
                ProjectType.WEB_DEVELOPMENT,
                projectManager.getCustomer(0)
        );

        project.addEmployee(projectManager.getEmployee(0));
        project.setManager(projectManager.getEmployee(1));

        project.addTask("jiji", "iniciar proyecto", new Date(), new Date(), TaskType.Programming);
        project.addTask("hahaha", "analizar proyecto", new Date(), new Date(), TaskType.Analysis);

        System.out.println(projectManager.getCustomer(0));
    }
}
