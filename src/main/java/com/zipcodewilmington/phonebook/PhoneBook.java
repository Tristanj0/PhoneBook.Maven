package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {
    private final Map<String, List<String>> phonebook;

    public Map<String, List<String>> getPhonebook() {
        return this.phonebook;
    }

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = new HashMap<>(map);
    }

    public PhoneBook() {
        this(new HashMap<>());
    }

    public void add(String name, String phoneNumber) {
        if (this.phonebook.containsKey(name)) {
            this.phonebook.get(name).add(phoneNumber);
        } else {
            this.phonebook.put(name, Collections.singletonList(phoneNumber));
        }
    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList(phoneNumbers));
        this.phonebook.put(name, numbers);
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber) {
        String number = "";
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            number = entry.getKey();
        }
        return number;
    }

    public List<String> getAllContactNames() {
        List<String> number = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            number.add(entry.getKey());

        }
        return number;
    }

        public Map<String, List<String>> getMap() {
            return this.phonebook;
        }
    }


