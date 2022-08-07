package HomeWork4;

import java.util.Scanner;

public class DevOps extends Employee{

    boolean workWithDocker;
    boolean workWithGit;
    boolean workWithJenkins;
    boolean workWithGrafana;


    // below constructor
    public DevOps () {

    }
    public DevOps(String name, String surName, int age, String specialization, double workExperience, String englishLevel) {
        super(name, surName, age, specialization, workExperience, englishLevel);
    }

    //below methods
    @Override
    public void setToolKnowledge(boolean workWithDocker, boolean workWithGit, boolean workWithJenkins,
                                 boolean workWithGrafana) {
        this.workWithDocker = workWithDocker;
        this.workWithGit = workWithGit;
        this.workWithJenkins = workWithJenkins;
        this.workWithGrafana = workWithGrafana;

    }
    public void getToolKnowledge () {
        System.out.printf("Tool knowledge.\nWork with Docker: %b,\nWork with Git: %b,\nWork with Jenkins: %b,\n"
                + "Work with Grafana: %b.\n", workWithDocker, workWithGit, workWithJenkins, workWithGrafana);
    }
}

