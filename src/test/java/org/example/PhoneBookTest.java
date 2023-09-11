package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {


    @Test
    void testadd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals("7-927-7972163", phoneBook.add("Юля", "7-927-7972163"));
        assertEquals("7-920-2222012", phoneBook.add("Марк", "7-920-2222012"));
    }
}