package org.example.consumer;

import org.example.service.Greeting;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        // creates a list of objects that implement Greeting, load(Greeting.class) tells the ServiceLoader to look for implementations of the Greeting interface
        ServiceLoader<Greeting> loader = ServiceLoader.load(Greeting.class);

        for (Greeting greeting : loader) {
            System.out.println(greeting.greet("august"));
        }

    }
}