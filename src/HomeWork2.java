import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
//         Exercise 1;

//        Scanner input = new Scanner(System.in);
//        String exit = "Exit";
//
//        do {
//            System.out.println("Please enter your world: ");
//            String yourText = input.next();
//            if (yourText.equals(exit)) {
//                System.out.println("The program is stopped!");
//                break;
//            }
//        } while (true);

        // ------------------------------------------------------

        // Exercise 2;
//
//        Scanner input = new Scanner(System.in);
//
//        do {
//            System.out.print("Please enter a number: ");
//            int sum = 0;
//            int x = input.nextInt();
//
//            if (x >= 0) {
//                for (int i = 0; i <= x; i++) {
//                    sum = sum + i;
//                }
//            }
//            else if (x < 0) {
//                do {
//                    System.out.print("Please enter a number: ");
//                    x = input.nextInt();
//                } while (x < 0);
//            }
//                for (int i = 0; i <= x; i++) {
//                sum = sum + i;
//                }
//
//           System.out.println("Result: " + sum );
//             break;
//
//        } while (true);

        // ---------------------------------------------------

        //Exercise 3;
//
//        do{
//            System.out.println("Please enter your score: ");
//            Scanner input = new Scanner(System.in);
//            int score = input.nextInt();
//
//            if (score < 0 || score > 100) {
//                do {
//                    System.out.println("You are entering an invalid value!!!");
//                    System.out.println("Please enter a valid value! ");
//                    score = input.nextInt();
//                } while (score < 0 || score > 100);
//            }
//            if (score >= 70) {
//                System.out.println("Congrats! You've passed the test!");
//
//            } else {
//                System.out.println("Sorry, you've failed the test!");
//            }
//
//            break;
//        } while (true);

        // ------------------------------------------------------------
        // Exercise 4;
//        Scanner input = new Scanner(System.in);
//        String[] channels = {"1.ONT", "2.BT", "3.NTV", "4.TNT", "5.SPORT", "6.Evronews", "7.AUTO+", "8.OceanTV", "9.TV-1000", "0.EXIT"};
//
//        int numberOfChannel;
//
//        do {
//            System.out.println("Please choose number of channel!");
//            for (String list : channels) {
//                System.out.println(list);
//            }
//            numberOfChannel = input.nextInt();
//
//            switch (numberOfChannel) {
//                case 1: {
//                    System.out.println("You have selected a channel " + channels[0]);
//                    System.out.println("Pleasant viewing!");
//                    System.out.println();
//                    System.out.println();
//                    break;
//                }
//
//                case 2: {
//                    System.out.println("You have selected a channel " + channels[1]);
//                    System.out.println("Pleasant viewing!");
//                    System.out.println();
//                    System.out.println();
//                    break;
//                }
//
//                case 3: {
//                    System.out.println("You have selected a channel " + channels[2]);
//                    System.out.println("Pleasant viewing!");
//                    System.out.println();
//                    System.out.println();
//                    break;
//                }
//
//                case 4: {
//                    System.out.println("You have selected a channel " + channels[3]);
//                    System.out.println("Pleasant viewing!");
//                    System.out.println();
//                    System.out.println();
//                    break;
//                }
//
//                case 5: {
//                    System.out.println("You have selected a channel " + channels[4]);
//                    System.out.println("Pleasant viewing!");
//                    System.out.println();
//                    System.out.println();
//                    break;
//                }
//
//                case 6: {
//                    System.out.println("You have selected a channel " + channels[5]);
//                    System.out.println("Pleasant viewing!");
//                    System.out.println();
//                    System.out.println();
//                    break;
//                }
//
//                case 7: {
//                    System.out.println("You have selected a channel " + channels[6]);
//                    System.out.println("Pleasant viewing!");
//                    System.out.println();
//                    System.out.println();
//                    break;
//                }
//
//                case 8: {
//                    System.out.println("You have selected a channel " + channels[7]);
//                    System.out.println("Pleasant viewing!");
//                    System.out.println();
//                    System.out.println();
//                    break;
//                }
//
//                case 9: {
//                    System.out.println("You have selected a channel " + channels[8]);
//                    System.out.println("Pleasant viewing!");
//                    System.out.println();
//                    System.out.println();
//                    break;
//                }
//                case 0: {
//                    System.out.println("You left watching TV channels!");
//                    System.out.println();
//                    System.out.println();
//                    break;
//                }
//
//            }
//        } while (numberOfChannel != 0);

        // ----------------------------------------------------------------------
        //Exercise 5;
//
//        System.out.println("Program 'My profile' welcomes you!!!");
//        System.out.println();
//
//        String[] personalData = {"1. Enter your name", "2. Enter your surname", "3. Enter year of birth",
//                "4. Output information", "0. Exit"};
//        Scanner input = new Scanner(System.in);
//
//        String name = null;
//        String surName = null;
//        Integer birth = null;
//
//        int chooseNumber;
//
//        do {
//
//            for (int i = 0; i < personalData.length; i++) {
//                System.out.println(personalData[i]);
//            }
//
//            chooseNumber = input.nextInt();
//
//            switch (chooseNumber) {
//                case 1: {
//                    System.out.println("Please enter your name!");
//                    name = input.next();
//                    break;
//
//                }
//                case 2: {
//                    System.out.println("Please enter your surname!");
//                    surName = input.next();
//                    break;
//                }
//                case 3: {
//                    System.out.println("Please enter your year of birth!");
//                    birth = input.nextInt();
//                    break;
//                }
//
//                case 4: {
//
//                    System.out.println("Information about you!");
//
//                    System.out.println("Your name is: " + name);
//                    System.out.println("Your surname is: " + surName);
//                    System.out.println("Your year of birth: " + birth);
//                    break;
//                }
//            }
//        }while (chooseNumber != 0) ;

        // ---------------------------------------
        //Tasks of linear programs

        //Task 1;

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter number one!");
//        int a = input.nextInt();
//        System.out.println("Please enter number two!");
//        int b = input.nextInt();
//        System.out.println("Sum: " + (a + b));
//        System.out.println("Subtraction: " + (a - b));
//        System.out.println("Multiplication: " + (a * b));
//        System.out.println("Division: " + (a / b));
        // -------------------------------------------------------

        //Task 2;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter value A!");
//        double a = input.nextDouble();
//        double c = 3 + a;
//        System.out.println("Function value: " + c);
        // --------------------------------------------------------

        //Task 3;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter value X!");
//        double x = input.nextDouble();
//        System.out.println("Please enter value Y!");
//        double y = input.nextDouble();
//        double z = 2 * x + (y - 2) * 5;
//        System.out.println("Function value: " + z);
        // --------------------------------------------------------

        //Task 4;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter value A!");
//        double a = input.nextDouble();
//        System.out.println("Please enter value B!");
//        double b = input.nextDouble();
//        System.out.println("Please enter value C!");
//        double c = input.nextDouble();
//        double z = ((a - 3) * b / 2) + c;
//        System.out.println("Function value: " + c);
//
        // --------------------------------------------------------
        //Task 5;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter value A!");
//        double a = input.nextDouble();
//        System.out.println("Please enter value B!");
//        double b = input.nextDouble();
//        double c = (a + b) / 2;
//        System.out.println("Arithmetic mean of two numbers: " + c);

        // --------------------------------------------------------

        // Task 6;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter value N!");
//        int m;
//        int n;
//        n = input.nextInt();
//        System.out.println("Please enter value M!");
//        m = input.nextInt();
//        int totalN = n * 80;
//        int totalM = m * (88 + 12);
//        System.out.println("Total count in N: " + totalN);
//        System.out.println("Total count in M: " + totalM);
//
        // --------------------------------------------------

        // Task 7;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the length of the rectangle!");
//        double a = input.nextDouble();
//        double b = a / 2;
//        double area = a * b;
//        System.out.println("The area of the rectangle: " + area);

        // --------------------------------------------------

        // Task 8;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter value A!");
//        double a = input.nextDouble();
//        System.out.println("Please enter value B!");
//        double b = input.nextDouble();
//        System.out.println("Please enter value C!");
//        double c = input.nextDouble();
//        double d = Math.pow(b,2) + (4 * a * c);
//        double result = ((b + Math.sqrt(d)) / (2 * a)) - ((Math.pow(a,3)) * c) + Math.pow(b,-2);
//        System.out.println("Result: " + result);

        // Task 9;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter value A!");
//        double a = input.nextDouble();
//        System.out.println("Please enter value B!");
//        double b = input.nextDouble();
//        System.out.println("Please enter value C!");
//        double c = input.nextDouble();
//        System.out.println("Please enter value D!");
//        double d = input.nextDouble();
//        double result = ((a / c) * (b / d)) - (((a * b) - c)) / (c * d);
//        System.out.println("Result: " + result);
//
        // --------------------------------------------

        // Task 10;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter value X!");
//        double x = input.nextDouble();
//        System.out.println("Please enter value Y!");
//        double y = input.nextDouble();
//        double up = Math.sin(x) + Math.cos(y);
//        double down = (Math.cos(x) - Math.sin(y));
//        double tgX = Math.tan(x);
//        double tgY = Math.tan(y);
//        double result = (up / down) * (tgX * tgY);
//        System.out.println("Result: " + result);

        // ----------------------------------------------

        // Task 11;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter value A!");
//        double a = input.nextDouble();
//        System.out.println("Please enter value B!");
//        double b = input.nextDouble();
//        double s = (a * b) / 2;
//        double g  = Math.sqrt((Math.pow(a,2)) + (Math.pow(b,2)));
//        double p = a + b + g;
//        System.out.println("Square: " + s);
//        System.out.printf("Perimeter: "+ p);



        // Tasks: cycles;

        // Task 1;
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
        // Task 2;
//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//        }

        // Task 3;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i*3);
//        }

        // Task 4;
//        int x = 2;
//
//        while (x >= 2 && x < 100) {
//            x = x + 2;
//            System.out.println(x);
//        }

        // Task 5;
//        int sum = 0;
//        int x = 1;
//
//        while (x >= 1 && x <= 99) {
//            //System.out.println(x);
//            sum = sum + x;
//            x = x + 2;
//
//        }
//        System.out.println("Sum is " + sum);

        // Task 6;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter number!");
//        int number = input.nextInt();
//
//        int sum = 0;
//
//        for (int i = 0; i <= number; i++) {
//            sum = sum + i;
//        }
//        System.out.println("The sum all numbers: " + sum);




    }
}






