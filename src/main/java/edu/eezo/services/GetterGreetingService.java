package edu.eezo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected bu the getter";
    }
}
