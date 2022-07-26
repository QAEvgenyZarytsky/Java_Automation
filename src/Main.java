import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                //Exercise 1;

// Example 1;
//        String name = "Evgeniy";
//        String surName = "Zarutskiy";
//        String profession = "QA engineer";
//        System.out.println("Hi everyone!");
//        System.out.println("My name is " + name + "!");
//        System.out.println("My surname is " + surName + "!");
//        System.out.println("My profession is " + profession + "!");

// Example 2;
//        String name = "Evgeniy";
//        String surName = "Zarutskiy";
//        String profession = "QA engineer";
//
//        String aboutMe = String.format("Hi everyone!\nMy name is %s!\nMy surname is %s!\nMy profession is %s!",
//                                        name, surName, profession);
//
//        System.out.println(aboutMe);

// Example 3;
//        System.out.println("Enter your name!");
//        Scanner userFullName = new Scanner(System.in);
//        String name = userFullName.nextLine();
//        System.out.println("Your name is: " + name + ";") ;
//
//        System.out.println();
//        System.out.println();
//        System.out.println("Enter your surname!");
//        String surName = userFullName.nextLine();
//        System.out.println("Your surname is: " + surName + ";" );
//
//        System.out.println();
//        System.out.println();
//        System.out.println("Enter your profession!");
//        String profession = userFullName.nextLine();
//        System.out.println("Your profession is: " + profession + ";" );
//
//        System.out.println();
//        System.out.println();
//        System.out.println("Information about you: ");
//        System.out.println("Your name is: " + name + ";");
//        System.out.println("Your surname is: " + surName + ";");
//        System.out.println("Your profession is: " + profession + ";");

        // ------------------------------------------------------------------

        //Exercise 2;
        // Example 1;
//        byte numByte = -123;
//        short numShort = 32545;
//        int numInt = 245;
//        long numLong  = 23895332636L;
//        float numFloat = 34.32f;
//        double numDouble = 82.325d;
//        boolean numBoolean = true;
//        char numChar = 'R';
//
//        System.out.println(numByte);
//        System.out.println(numShort);
//        System.out.println(numInt);
//        System.out.println(numLong);
//        System.out.println(numFloat);
//        System.out.println(numDouble);
//        System.out.println(numBoolean);
//        System.out.println(numChar);

        // -------------------------------------------------------------------

        //Exercise 3;
        // Example 1;
        System.out.println("Enter your text please!");
        Scanner inputText = new Scanner(System.in);
        String text = inputText.nextLine();
        System.out.println("Your message:" + "'" + text + "'" + ";");

        System.out.println("Enter repeat your text please!");
        String repeatText = inputText.nextLine();
        System.out.println("Your message:" + "'" + repeatText + "'" + ";");

        System.out.println();
        System.out.println();

        //Operation with text!

        int textLength = text.length();   // -- длинна строки!
        boolean textIsEmpty = text.isEmpty(); // -- текст имеет пустое значение?!
        char textCharAt = text.charAt(5);
        boolean textEqual = text.equals(repeatText);
        //boolean

        System.out.println("Operations with entered text!");
        System.out.println();
        System.out.println("Length your text is: " + textLength + ";");
        System.out.println("Your text is empty: " + textIsEmpty + ";");
        System.out.println("Your 5 char is: " + textCharAt + ";");
        System.out.println("You repeated the text correctly: " + textEqual + ";");















        // Currency Converter
//
//        System.out.println("Enter your foreign currency amount!");
//        Scanner userInput = new Scanner(System.in);
//        double sum = userInput.nextDouble();
//        System.out.println("Your foreign currency amount: " + sum + ";");
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println("Enter the currency purchase rate by the bank!");
//        double course = userInput.nextDouble();
//        System.out.println("Current conversion rate: " + course + ";");
//
//        System.out.println("The system is processing your request!");
//        System.out.println();
//        System.out.println();
//
//        double amountExchange = sum * course;
//
//        System.out.println("The amount of currency exchange is: " + amountExchange + " BYN;" );

        // ---------------------------------------------------------------------------
















    }
}