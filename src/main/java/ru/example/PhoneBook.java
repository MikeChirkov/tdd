package ru.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private final Map<String, List<String>> numbers = new HashMap<>();
    private final Map<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, number);
            List<String> names = new ArrayList<>();
            if (numbers.containsKey(number)) {
                names = numbers.get(number);
            }
            names.add(name);
            numbers.put(number, names);
        }
        return contacts.size();
    }

    public String findByNumber(String number) {
        return String.join(", ", numbers.get(number));
    }

    public String findByName(String name) {
        return contacts.get(name);
    }
}
