package org.example;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class PhoneBook {
    private BidiMap<String, String> bidimapPhoneBook;

    PhoneBook() {
        this.bidimapPhoneBook = new TreeBidiMap<>();
    }

    public int add(String name, String phone) {
        bidimapPhoneBook.putIfAbsent(name, phone);
        return bidimapPhoneBook.size();
    }

    public static String findByNumber(String phone) {

        return null;
    }
}