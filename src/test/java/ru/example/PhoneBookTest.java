package ru.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Test
    void add() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Test", "1234");
        int count = phoneBook.add("Test2", "4321");
        assertEquals(2, count);
    }
}