package rleu.sfg.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import rleu.sfg.dependencyinjection.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // @Autowired annotation optional for constructor now
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
