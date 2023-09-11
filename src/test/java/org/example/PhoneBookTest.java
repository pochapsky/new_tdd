package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {


    @Test
    public void testadd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Юля", "7-927-7972163"));
        assertEquals(2, phoneBook.add("Марк", "7-920-2222012"));
    }

    @Test
    public void testfindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Юля", "7-927-7972163");
        phoneBook.add("Марк", "7-920-2222012");
        phoneBook.add("Никита", "7-925-7732334");
        phoneBook.add("Дэйзи", "7-915-2534348");
        phoneBook.add("Михаил", "7-921-7972163");
        Assertions.assertNull(phoneBook.findByNumber("89500000000"));
        assertEquals("Мария", phoneBook.findByNumber("89500000011"));
        assertEquals("Алексей", phoneBook.findByNumber("89500000022"));
    }
}