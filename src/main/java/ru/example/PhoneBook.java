package ru.example;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private final Map<String, List<String>> numbers = new HashMap<>();
    private final SortedMap<String, String> contacts = new TreeMap<>();

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

    public String printAllNames() {
        return String.join(", ", contacts.keySet());
    }
}
