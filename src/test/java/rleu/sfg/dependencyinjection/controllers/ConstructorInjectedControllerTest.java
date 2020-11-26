package rleu.sfg.dependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rleu.sfg.dependencyinjection.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}