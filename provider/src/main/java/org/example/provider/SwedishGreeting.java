package org.example.provider;

import org.example.service.Greeting;

public class SwedishGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Hej " + name;
    }
}
