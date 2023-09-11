package org.example;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private BidiMap<String, String> bidimapPhoneBook;

    PhoneBook() {
        this.bidimapPhoneBook = new TreeBidiMap<>();
    }

    public int add(String name, String phone) {
        bidimapPhoneBook.putIfAbsent(name, phone);
        return bidimapPhoneBook.size();
    }

    public String findByNumber(String phone) {

        return bidimapPhoneBook.getKey(phone);
    }

    public String findByName(String name) {

        return bidimapPhoneBook.get(name);
    }

    public String printAllNames() {
        List<String> listNameSorted = new ArrayList<>(bidimapPhoneBook.keySet());
        Collections.sort(listNameSorted);
        return String.join(", ", listNameSorted);

    }
}