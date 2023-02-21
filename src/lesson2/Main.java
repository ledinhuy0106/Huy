package lesson2;

import java.util.Scanner;

import static lesson2.Total.add;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("What do you want to do? (1: Add two numbers, 2: Add three numbers, 3: Add four numbers, 4: Exit)");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the first number:");
                    int a1 = scanner.nextInt();

                    System.out.println("Please enter the second number:");
                    int b1 = scanner.nextInt();

                    int sum1 = add(a1, b1);
                    System.out.println("The sum is: " + sum1);
                    break;

                case 2:
                    System.out.println("Please enter the first number:");
                    int a2 = scanner.nextInt();

                    System.out.println("Please enter the second number:");
                    int b2 = scanner.nextInt();

                    System.out.println("Please enter the third number:");
                    int c2 = scanner.nextInt();

                    int sum2 = add(a2, b2, c2);
                    System.out.println("The sum is: " + sum2);
                    break;

                case 3:
                    System.out.println("Please enter the first number:");
                    int a3 = scanner.nextInt();

                    System.out.println("Please enter the second number:");
                    int b3 = scanner.nextInt();

                    System.out.println("Please enter the third number:");
                    int c3 = scanner.nextInt();

                    System.out.println("Please enter the fourth number:");
                    int d3 = scanner.nextInt();

                    int sum3 = add(a3, b3, c3, d3);
                    System.out.println("The sum is: " + sum3);
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

}
