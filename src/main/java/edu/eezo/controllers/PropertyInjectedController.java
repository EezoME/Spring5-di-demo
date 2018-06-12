package edu.eezo.controllers;

import edu.eezo.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
