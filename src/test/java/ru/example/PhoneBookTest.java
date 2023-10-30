package ru.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Test
    void add() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add();
        int count = phoneBook.add();
        assertEquals(2, count);
    }
}