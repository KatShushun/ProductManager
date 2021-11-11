package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product = new Product(1, "Дэнс, дэнс, дэнс", 500);

    @Test
    void shouldMatchByNameIfExists() {
        String textToFind = "Дэнс, дэнс, дэнс";
        product.matches(textToFind);
        assertTrue(product.matches(textToFind));
    }

    @Test
    void shouldMatchByNameIfNoExists() {
        String textToFind = "Гранатовый браслет";
        product.matches(textToFind);
        assertFalse(product.matches(textToFind));
    }
}
