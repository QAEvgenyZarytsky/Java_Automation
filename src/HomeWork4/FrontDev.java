package HomeWork4;

import java.util.Scanner;

public class FrontDev extends Employee{
    boolean workWithHtml;
    boolean workWithCss;
    boolean workWithJavaScript;
    boolean workWithReact;


    // below constructor
    public FrontDev() {
    }

    public FrontDev(String name, String surName, int age, String specialization, double workExperience, String englishLevel) {
        super(name, surName, age, specialization, workExperience, englishLevel);
    }

    //below methods
    @Override
    public void setToolKnowledge(boolean workWithHtml, boolean workWithCss, boolean workWithJavaScript,
                                 boolean workWithReact) {
        this.workWithHtml = workWithHtml;
        this.workWithCss = workWithCss;
        this.workWithJavaScript = workWithJavaScript;
        this.workWithReact = workWithReact;

    }
    public void getToolKnowledge () {
        System.out.printf("Tool knowledge.\nWork with HTML: %b,\nWork with CSS: %b,\nWork with JavaScript: %b,\n"
                + "Work with REACT: %b.", workWithHtml, workWithCss, workWithJavaScript, workWithReact);
    }
}

