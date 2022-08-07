package HomeWork4;

import java.util.Scanner;

import static java.awt.SystemColor.info;

public class Main {


    public static void main(String[] args) {


//        Employee person1 = new Employee("Zak", "Stormck", 23, "QA engineer",
//                1.5, "B1");
//        person1.personalInfo();
//        person1.equipment = new Equipment(12, "Laptop", "Dell",
//                "model 2021", 1 );
//        person1.showEquipment();
//
//        QA person2 = new QA("Tomas", "Hard",28, "QA",
//                2.3, "B2");
//        person2.setToolKnowledge(true, true, true, true);
//        person2.getToolKnowledge();

//        FrontDev person3 = new FrontDev("Mike", "Hastl", 33, "Frontend developer", 2,
//                "B2");
//        person3.equipment = new Equipment(121, "Laptop", "Macbook", "model 2020", 2);
//        person3.setToolKnowledge(true, true, true, true);
//        person3.personalInfo();
//        person3.getToolKnowledge();
//        person3.showEquipment();

//        BackDev person4 = new BackDev("Elena", "Drust", 28, "Backend developer",
//                3.4, "B2");
//        person4.setToolKnowledge( true, true, true, true);
//        person4.equipment = new Equipment();
//        person4.personalInfo();
//        person4.getToolKnowledge();
//        person4.showEquipment();

          DevOps person5 = new DevOps("Dmitry", "Shokel", 34, "DevOps",
                  4.5, "B2");
          person5.setToolKnowledge( true, true, true, true);
          person5.equipment = new Equipment();
//          person5.personalInfo();
//          person5.getToolKnowledge();
//          person5.showEquipment();
//          person5.getSalary();
//          person5.getSickDay();
          outInfo(person5);


    }



    public static void outInfo(SharedAbilities info) {
        info.personalInfo();
        info.getSalary();
        info.getSickDay();
        info.showEquipment();
    }

}
