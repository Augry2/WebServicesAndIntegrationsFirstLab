package org.example.consumer;

import org.example.service.Exchange;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        // creates a list of objects that implement Greeting, load(Greeting.class) tells the ServiceLoader to look for
        // implementations of the Greeting interface
        ServiceLoader<Exchange> loader = ServiceLoader.load(Exchange.class);

        menu(loader);
    }

    public static void menu(ServiceLoader<Exchange> loader) {
        boolean exit = false;
        while (!exit) {
            Scanner fetch = new Scanner(System.in);
            String valueSek = inputAmountInSek(fetch);
            String choice = selectEuroOrDollar(fetch);

            switch (choice) {
                case "1":
                    for (Exchange exchange : loader) {
                        if (exchange.getCurrency().equals("euro")) {
                            System.out.println(exchange.exchange(valueSek));
                        }
                    }
                    break;
                case "2":
                    for (Exchange exchange : loader) {
                        if (exchange.getCurrency().equals("dollar")) {
                            System.out.println(exchange.exchange(valueSek));
                        }
                    }
                    break;
                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }
    }

    private static String selectEuroOrDollar(Scanner fetch) {
        System.out.println("1. Convert to Euro");
        System.out.println("2. Convert to Dollar");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        String choice = fetch.nextLine();

        while (true) {
            if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
                return choice;
            } else {
                System.out.println("Invalid choice. Please enter a valid choice.");
                choice = fetch.nextLine();
            }
        }
    }

    public static String inputAmountInSek(Scanner fetch) {
        while (true) {
            System.out.print("enter value in SEK: ");
            String value = fetch.nextLine();
            try { // if the parse fails it's not a number
                Integer.parseInt(value);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("The input is not a number. Please enter a valid number.");
            }
        }
    }

}