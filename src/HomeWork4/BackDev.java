package HomeWork4;

import java.util.Scanner;

public class BackDev extends Employee{

    boolean workWithJava;
    boolean workWithApi;
    boolean workWithJavaScript;
    boolean workWithGit;


    // below constructor
    public BackDev() {
    }

    public BackDev(String name, String surName, int age, String specialization, double workExperience, String englishLevel) {
        super(name, surName, age, specialization, workExperience, englishLevel);
    }

    //below methods
    @Override
    public void setToolKnowledge(boolean workWithJava, boolean workWithApi, boolean workWithJavaScript,
                                 boolean workWithGit) {
        this.workWithJava = workWithJava;
        this.workWithApi = workWithApi;
        this.workWithJavaScript = workWithJavaScript;
        this.workWithGit = workWithGit;

    }
    public void getToolKnowledge () {
        System.out.printf("Tool knowledge.\nWork with Java: %b,\nWork with API: %b,\nWork with JavaScript: %b,\n"
                + "Work with Git: %b.\n", workWithJava, workWithApi, workWithJavaScript, workWithGit);
    }
}

