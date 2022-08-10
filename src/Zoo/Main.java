package Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // collections for our data



        ArrayList<String> nameOfAnimals = new ArrayList<>();
        ArrayList<Double> ageOfAnimals = new ArrayList<>();
        ArrayList<Double> weightOfAnimals = new ArrayList<>();

        ArrayList<String> nameOfObjects = new ArrayList<>();



        // ------------------TheFirstElement-----------------------------------
        Animal animal0 = new Animal("Exit", 0.0, 0.0);

        nameOfAnimals.add("Exit");
        ageOfAnimals.add(0.0);
        weightOfAnimals.add(0.0);
        nameOfObjects.add("animal0");  /// тут есть решение!!!!


        // -----------animal1----------------------------------

        Animal animal1 = new Animal("Mr.Bulbozavrik", 2.3, 99.5);

        // adding data to our collections

        nameOfAnimals.add(animal1.name);
        ageOfAnimals.add(animal1.age);
        weightOfAnimals.add(animal1.weight);
        nameOfObjects.add("animal1");


        // information about our animal

        animal1.infoAboutAnimal();
        showAbilities(animal1);

        // -----------animal2----------------------------------

        Animal animal2 = new Animal("Govroshik", 3.4, 145.3);

        // adding data to our collections

        nameOfAnimals.add(animal2.name);
        ageOfAnimals.add(animal2.age);
        weightOfAnimals.add(animal2.weight);
        nameOfObjects.add("animal2");

        // information about our animal

        animal2.infoAboutAnimal();
        showAbilities(animal2);

        // -----------animal3----------------------------------

        Animal animal3 = new Animal("Nafanya", 15.9, 35.9);

        // adding data to our collections

        nameOfAnimals.add(animal3.name);
        ageOfAnimals.add(animal3.age);
        weightOfAnimals.add(animal3.weight);
        nameOfObjects.add("animal3");


        // information about our animal

        animal3.infoAboutAnimal();
        showAbilities(animal3);

        // -----------beast1----------------------------------

        Beast medvogonok = new Beast("Medvogonok", 9.6, 345.1);

        // adding data to our collections

        nameOfAnimals.add(medvogonok.name);
        ageOfAnimals.add(medvogonok.age);
        weightOfAnimals.add(medvogonok.weight);
        nameOfObjects.add("medvogonok");


        // information about our animal

        medvogonok.infoAboutAnimal();
        showAbilities(medvogonok);
        showUniqueAbilitiesForBeast(medvogonok);

        // -----------beast2----------------------------------

        Beast egik = new Beast("Egik", 1.7, 2.6);

        // adding data to our collections

        nameOfAnimals.add(egik.name);
        ageOfAnimals.add(egik.age);
        weightOfAnimals.add(egik.weight);
        nameOfObjects.add("egik");

        // information about our animal

        egik.infoAboutAnimal();
        showAbilities(egik);
        showUniqueAbilitiesForBeast(egik);

        // -----------beast3----------------------------------

        Beast enotik = new Beast("Enotik", 4.6, 17.4);

        // adding data to our collections

        nameOfAnimals.add(enotik.name);
        ageOfAnimals.add(enotik.age);
        weightOfAnimals.add(enotik.weight);
        nameOfObjects.add("enotik");

        // information about our animal

        enotik.infoAboutAnimal();
        showAbilities(enotik);
        showUniqueAbilitiesForBeast(enotik);

        // -----------bird1----------------------------------

        Bird zazu = new Bird("Zazu", 2.1, 1.3);

        // adding data to our collections

        nameOfAnimals.add(zazu.name);
        ageOfAnimals.add(zazu.age);
        weightOfAnimals.add(zazu.weight);
        nameOfObjects.add("zazu");

        // information about our animal

        zazu.infoAboutAnimal();
        showAbilities(zazu);
        showUniqueAbilitiesForBird(zazu);

        // -----------bird2----------------------------------

        Bird zmeygorynych = new Bird("Zmey Gorynych", 46.3, 3124.3);

        // adding data to our collections

        nameOfAnimals.add(zmeygorynych.name);
        ageOfAnimals.add(zmeygorynych.age);
        weightOfAnimals.add(zmeygorynych.weight);
        nameOfObjects.add("zmeygorynych");

        // information about our animal

        zmeygorynych.infoAboutAnimal();
        showAbilities(zmeygorynych);
        showUniqueAbilitiesForBird(zmeygorynych);

        // -----------bird3----------------------------------

        Bird donalddak = new Bird("Donald Dak", 33.1, 67.6);

        // adding data to our collections

        nameOfAnimals.add(donalddak.name);
        ageOfAnimals.add(donalddak.age);
        weightOfAnimals.add(donalddak.weight);
        nameOfObjects.add("donalddak");

        // information about our animal

        donalddak.infoAboutAnimal();
        showAbilities(donalddak);
        showUniqueAbilitiesForBird(donalddak);


        // -----------fish1----------------------------------


        Fish rusalochka = new Fish("Rusalochka", 19.1, 65.4);

        // adding data to our collections

        nameOfAnimals.add(rusalochka.name);
        ageOfAnimals.add(rusalochka.age);
        weightOfAnimals.add(rusalochka.weight);
        nameOfObjects.add("rusalochka");

        // information about our animal

        rusalochka.infoAboutAnimal();
        showAbilities(rusalochka);
        showUniqueAbilitiesForFish(rusalochka);

        // -----------fish2----------------------------------

        Fish nemo = new Fish("Nemo", 4.3, 5.1);

        // adding data to our collections

        nameOfAnimals.add(nemo.name);
        ageOfAnimals.add(nemo.age);
        weightOfAnimals.add(nemo.weight);
        nameOfObjects.add("nemo");

        // information about our animal

        nemo.infoAboutAnimal();
        showAbilities(nemo);
        showUniqueAbilitiesForFish(nemo);

        // -----------fish3----------------------------------

        Fish zolotayarybka = new Fish("Zolotaya rybka", 999.99, 1.2);

        // adding data to our collections

        nameOfAnimals.add(zolotayarybka.name);
        ageOfAnimals.add(zolotayarybka.age);
        weightOfAnimals.add(zolotayarybka.weight);
        nameOfObjects.add("zolotayarybka");

        // information about our animal

        nemo.infoAboutAnimal();
        showAbilities(nemo);
        showUniqueAbilitiesForFish(zolotayarybka);

        // ------------------sizeOfCollections-------------------------------

//        int size1 =  nameOfAnimals.size();
//        System.out.println("Names in our collection: " + size1);
//
//        int size2 =  ageOfAnimals.size();
//        System.out.println("Age in our collection: " + size2);
//
//        int size3 =  weightOfAnimals.size();
//        System.out.println("Weight in our collection: " + size3);

        // ---------------------showOurCollections-------------------------------


        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.println("Choose animals and get information about it!\n");
            for (int i = 0; i < nameOfAnimals.size(); i++) {
                String listOfName = nameOfAnimals.get(i);
//                Double listOfAge = ageOfAnimals.get(i);
//                Double listOfWeight = weightOfAnimals.get(i);

                System.out.println(i + ". " + listOfName + ";");
                //System.out.println(i + "." + listOfName + ", " + listOfAge + ", " + listOfWeight);
            }

            number = input.nextInt();

            for (int j = 1; j < nameOfAnimals.size(); j++) {
                String listOfName = nameOfAnimals.get(j);
                Double listOfAge = ageOfAnimals.get(j);
                Double listOfWeight = weightOfAnimals.get(j);
                String listOfObjects = nameOfObjects.get(j);


                if(j == number) {
                    System.out.printf("Information about animal!\nThe name: %s,\nThe age: %f,\n" +
                            "The weight: %f\n", listOfName, listOfAge, listOfWeight);

                    /* я могу вывестити только имя животного, возраст и вес, но нужно ещё вывести и информациюю о нём.
                       вся информация о животных хранится у меня в методе showAbilities, но туда принимается параметр с
                       типом данных Animal, как мне сделать так чтобы я смог достать из коллекции nameOfObjects имя
                       объекта по индексу и передать его в метод showAbilities, чтобы получить всю информацию о том
                       или ином животном.

                       из коллекции я могу достать только имя с типом данных String, а метод принимат тип данных Animal!
                     */
                    System.out.println();
                    System.out.println();

                    System.out.println(listOfObjects);



                    //System.out.println(showAbilities());
                    //System.out.println(nameOfAnimals);
                    System.out.println();

                    //System.out.println(nameOfAnimals.contains("Nafanya"));


                }
            }

        } while (number != 0);


    }

    // below methods

    public static void showAbilities(Animal animal) {
        System.out.println("Animal abilities!");
        animal.animalBreathes();
        animal.animalMoves();
        animal.animalSleeping();
        animal.animalEating();
        System.out.println("Oops... it's all!\n");
    }

    public static void showUniqueAbilitiesForBeast(Beast beast) {
        System.out.println("It's unique abilities of beast!");
        beast.beastSound();
        beast.beastJump();
    }

    public static void showUniqueAbilitiesForBird(Bird bird) {
        System.out.println("It's unique abilities of bird!");
        bird.birdSound();
        bird.birdJump();
    }

    public static void showUniqueAbilitiesForFish(Fish fish) {
        System.out.println("It's unique abilities of fish!");
        fish.fishSound();
        fish.fishJump();
    }



}
