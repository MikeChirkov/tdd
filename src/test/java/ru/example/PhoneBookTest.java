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
    @Test
    void findByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Test", "1234");
        phoneBook.add("Test2", "4321");
        String name = phoneBook.findByNumber("4321");
        assertEquals("Test2", name);
    }
}