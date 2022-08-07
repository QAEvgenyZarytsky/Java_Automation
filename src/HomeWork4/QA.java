package HomeWork4;

import java.util.Scanner;

public class QA extends Employee {
    boolean automationTest;
    boolean workWithPostman;
    boolean workWithDevTools;
    boolean workWithGit;


    // below constructor
    public QA() {
    }
    public QA(String name, String surName, int age, String specialization, double workExperience, String englishLevel) {
        super(name, surName, age, specialization, workExperience, englishLevel);
    }

    @Override
    public void setToolKnowledge(boolean automationTest, boolean workWithPostman, boolean workWithDevTools,
                                 boolean workWithGit) {
        this.automationTest = automationTest;
        this.workWithPostman = workWithPostman;
        this.workWithDevTools = workWithDevTools;
        this.workWithGit = workWithGit;

    }
    @Override
    public void getToolKnowledge () {
        System.out.printf("Tool knowledge.\nAutomation testing: %b,\nWork with Postman: %b,\nWork with DevTools: %b,\n"
                + "Work with Git: %s.", automationTest, workWithPostman, workWithDevTools, workWithGit);
    }
}
