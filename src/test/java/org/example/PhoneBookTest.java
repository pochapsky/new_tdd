package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {


    @Test
   public void testadd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Юля", "7-927-7972163"));
        assertEquals(2, phoneBook.add("Марк", "7-920-2222012"));
    }
}