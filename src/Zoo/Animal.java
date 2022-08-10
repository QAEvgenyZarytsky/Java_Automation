package Zoo;

public class Animal implements GeneralProperties{

    static int counterAnimals;

    protected String name;
    protected double age;

    protected double weight;


    // below constructor

    public Animal(){};

    public Animal(String name, Double age, Double weight ) {
       setName(name);
       setAge(age);
       setWeight(weight);
   };

    // below getters and setters for variables

    public void setName(String name) {
        this.name = name;
    }

    public void getName(){
        System.out.println("My name: " + name);
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public void getAge(){
        System.out.println("My age: " + age);
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void getWeight(){
        System.out.println("My weight: " + weight);
    }

    // information about animal

    public void infoAboutAnimal() {
        System.out.println("Hello my friend!\n");
        getName();
        getAge();
        getWeight();
        System.out.println();
    }

    // below methods


    @Override
    public void animalBreathes() {
        // nothing yet
        System.out.println("nothing yet");
    }

    @Override
    public void animalMoves() {
        // nothing yet
        System.out.println("nothing yet");
    }

    public void animalSleeping(){
        // nothing yet
        System.out.println("nothing yet");
    }

    public void animalEating() {
        // nothing yet
        System.out.println("nothing yet");
    }
}
