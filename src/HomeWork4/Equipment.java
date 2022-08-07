package HomeWork4;

import java.util.Scanner;

public class Equipment {
    int id;
    String nameOfEquipment;
    String model;
    String characteristics;
    int amount;

    //below constructor for create equipment;
    public Equipment () {
    };
    public Equipment (int id, String nameOfEquipment, String model, String characteristics, int amount) {

       this.id = id;
       this.nameOfEquipment = nameOfEquipment;
       this.model = model;
       this.characteristics = characteristics;
       this.amount = amount;
   }

   //method show equipment

   //show equipment;
    public void useEquipment () {
        System.out.printf("Use equipment!\nID: %d,\nName of equipment: %s,\nModel: %s,\nCharacteristics: %s\n" +
                "Amount: %d.\n", id, nameOfEquipment, model, characteristics, amount);
    }


}
