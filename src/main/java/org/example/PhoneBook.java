package org.example;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class PhoneBook {
    private BidiMap<String, String> bidimapPhoneBook;

    PhoneBook() {
        this.bidimapPhoneBook = new TreeBidiMap<>();
    }

    private static int add(String name, String phone) {
        return 0;
    }
}