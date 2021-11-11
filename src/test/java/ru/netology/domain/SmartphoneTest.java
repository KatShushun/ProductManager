package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone smartphone = new Smartphone(4, "Iphone", 50000, "Apple");

    @Test
    void shouldMatchByNameIfExists() {
        String textToFind = "Iphone";
        smartphone.matches(textToFind);
        assertTrue(smartphone.matches(textToFind));
    }

    @Test
    void shouldMatchByNameIfNoExists() {
        String textToFind = "Galaxy";
        smartphone.matches(textToFind);
        assertFalse(smartphone.matches(textToFind));
    }

    @Test
    void shouldMatchByProducerIfExists() {
        String textToFind = "Apple";
        smartphone.matches(textToFind);
        assertTrue(smartphone.matches(textToFind));
    }

    @Test
    void shouldMatchByProducerIfNoExists() {
        String textToFind = "Samsung";
        smartphone.matches(textToFind);
        assertFalse(smartphone.matches(textToFind));
    }
}
