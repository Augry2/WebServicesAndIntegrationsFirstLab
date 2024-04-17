package org.example.consumer;

import org.example.service.Exchange;

import java.io.IOException;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) throws IOException {
        // creates a list of objects that implement Greeting, load(Greeting.class) tells the ServiceLoader to look for implementations of the Greeting interface
        ServiceLoader<Exchange> loader = ServiceLoader.load(Exchange.class);

        menu(loader);
    }

    public static void menu(ServiceLoader<Exchange> loader) {
        Scanner fetch = new Scanner(System.in);
        boolean exit = false;
        String valueSek = enterSek(fetch);



    }



    public static String enterSek(Scanner fetch){
        while (true){
            System.out.print("enter value in SEK: ");
            String value = fetch.nextLine();
            try { // if the parse fails its not a number
                Integer.parseInt(value);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("The input is not a number. Please enter a valid number.");
            }
        }
    }

}