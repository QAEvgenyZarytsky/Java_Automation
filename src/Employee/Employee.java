package Employee;

public class Employee {
    static int count;
    int id;
    String name;
    String surName;
    int age;
    String specialization;
    String grade;
    double workExperience;
    String englishLevel;

    public Employee () {
        System.out.println("New employee!");
        count++;
    }

    public Employee (String name, String surName, int age) {

        this.name = name;
        this.surName = surName;
        this.age = age;
        System.out.printf("Name is %s\nSurname is %s\nAge is %d\n", name, surName, age);
        count++;
    }
    public Employee (String name, String surName, int age, String specialization, String grade, double workExperience,
                     String englishLevel) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.specialization = specialization;
        this.grade = grade;
        this.workExperience = workExperience;
        this.englishLevel = englishLevel;
        System.out.printf("Name is %s\nSurname is %s\nAge is %d\nSpecialization is %s\nGrade: %s\nWork expirience is " +
                "%f year\nEnglish level is %s\n", name, surName, age, specialization, grade, workExperience, englishLevel);
        count++;
    }

    public void testFront() {
        System.out.println("Can test front");
    }
    public void testBack() {
        System.out.println("Can test back");
    }
    public void testAuto () {
        System.out.println("Knows automation");
    }




}
