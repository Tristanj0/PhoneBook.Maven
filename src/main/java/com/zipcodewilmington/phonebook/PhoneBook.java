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
        return this.getPhonebook();
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
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        if (this.phonebook.containsKey(name)) {
            return true;
        }
        if (this.phonebook.containsKey(phoneNumber)) {
            return true;
        }
        return false;
    }

    public List<String> lookup(String name) {
        return this.phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String number = null;
        for (String x : this.phonebook.keySet()) {
            number = x;
        }
        return number;
    }

    public List<String> getAllContactNames() {
        return new ArrayList<>(this.phonebook.keySet());
    }

    public Map<String, List<String>> getMap() {
        return this.getMap();
    }
}
