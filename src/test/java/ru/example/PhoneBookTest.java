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

    @Test
    void findByNumberMoreNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Test", "4321");
        phoneBook.add("Test2", "4321");
        String name = phoneBook.findByNumber("4321");
        assertEquals("Test, Test2", name);
    }

    @Test
    void findByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Test", "4321");
        phoneBook.add("Test2", "4321");
        String number = phoneBook.findByName("Test");
        assertEquals("4321", number);
    }


    @Test
    void printAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Test4", "4321");
        phoneBook.add("Test2", "4321");
        phoneBook.add("Test1", "4321");
        phoneBook.add("Test3", "4321");
        String names = phoneBook.printAllNames();
        assertEquals("Test1, Test2, Test3, Test4", names);
    }
}