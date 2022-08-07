package HomeWork4;

import java.sql.SQLOutput;
import java.util.Scanner;

public abstract class Employee implements SharedAbilities {
    static int countEmployees;

    static int id;
    String name;
    String surName;
    int age;
    String specialization;
    String grade;
    double workExperience;
    String englishLevel;
    double salary;
    final int SICK_DAY = 5;
    final int VACATION = 28;
    final double INSURANCE = 80;
    Equipment equipment;


    // below method from interface SharedAbilities
    public void personalInfo() {
        System.out.printf("Information about employee! ID: %d,\n" +
                "Name:  %s,\nSurname: %s,\nAge: %d,\nSpecialization: %s,\nWork experience: %f,\n" +
                "English level: %s.\n", id, name, surName, age, specialization, workExperience, englishLevel);
    }

    public void showEquipment() {
        equipment.useEquipment();
    }
    public void getSalary() {
        if (workExperience > 2 && englishLevel.equals("B2")) {
            this.salary = 1500.00;
        } else {
            this.salary = 1000.00;
        }
        System.out.println("Salary: " + salary);
    }

    public void getSickDay() {
        Scanner input = new Scanner(System.in);
        int count;
        System.out.println("Please enter the number of sick days you have already used!");

        do {
            count = input.nextInt();
            if (count < 0 || count > 5) {
                System.out.println("Please enter a valid count!");
            } else {
                System.out.println("Thanks!");
                break;
            }
        } while (true);
        int result = SICK_DAY - count;
        System.out.println("Number of sick days: " +  result + "!");
    }

    public void setToolKnowledge(boolean a, boolean b, boolean c, boolean d) {
    }

    public void getToolKnowledge() {}


    // below constructor
    public Employee() {
        System.out.println("Please enter employee name!");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        this.name = name;
        System.out.println("Please enter employee surname!");
        String surName = input.next();
        this.surName = surName;
        System.out.println("Please enter employee age!");
        int age = input.nextInt();
        this.age = age;
        System.out.println("Please enter employee specialization!");
        String specialization = input.next();
        this.specialization = specialization;
        System.out.println("Please enter employee work experience!");
        double workExperience = input.nextDouble();
        this.workExperience = workExperience;
        System.out.println("Please enter employee English level!");
        String englishLevel = input.next();
        this.englishLevel = englishLevel;

        countEmployees++;
        this.id = countEmployees;

        System.out.println("Employee added!\n");

    }
    public Employee(String name, String surName, int age, String specialization, double workExperience,
                    String englishLevel) {

        this.name = name;
        this.surName = surName;
        this.age = age;
        this.specialization = specialization;
        this.workExperience = workExperience;
        this.englishLevel = englishLevel;
        countEmployees++;
        this.id = countEmployees;

    }
}


