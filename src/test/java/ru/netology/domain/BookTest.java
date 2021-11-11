package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book = new Book(3, "Шантарам", 500, "Робертс" );

    @Test
    void shouldMatchByNameIfExists() {
        String textToFind = "Шантарам";
        book.matches(textToFind);
        assertTrue(book.matches(textToFind));
    }

    @Test
    void shouldMatchByNameIfNoExists() {
        String textToFind = "Гранатовый браслет";
        book.matches(textToFind);
        assertFalse(book.matches(textToFind));
    }

    @Test
    void shouldMatchByAuthorIfExists() {
        String textToFind = "Робертс";
        book.matches(textToFind);
        assertTrue(book.matches(textToFind));
    }

    @Test
    void shouldMatchByAuthorIfNoExists() {
        String textToFind = "Куприн";
        book.matches(textToFind);
        assertFalse(book.matches(textToFind));
    }

}
