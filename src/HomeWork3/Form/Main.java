package HomeWork3.Form;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        Form person = new Form();

        do {
            System.out.println("Start program!");
            System.out.println();
            System.out.println("1.Enter your name!\n2.Enter your surname!\n" +
                    "3.Enter your profession!\n4.Infomation about you!\n0.Exit!");
            number = input.nextInt();
            switch (number) {
                case 1: {
                    System.out.println("Please enter your name!");
                    person.name = input.next();
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("Please enter your surname!");
                    person.surName = input.next();
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("Please enter your profession!");
                    person.profession = input.next();
                    System.out.println();
                    break;
                }
                case 4: {
                    person.info();
                }
            }

        } while (number != 0);
    }
}







