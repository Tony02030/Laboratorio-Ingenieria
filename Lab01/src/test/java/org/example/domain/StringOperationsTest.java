package org.example.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOperationsTest {

    @Test
    public void testEmptyString() {
        String str = "";
        int count = StringOperations.countSpecialCharacters(str);
        assertEquals(0, count);
    }

    @Test
    public void testStringWithNoSpecialChars() {
        String str = "Hello world";
        int count = StringOperations.countSpecialCharacters(str);
        assertEquals(0, count);
    }

    @Test
    public void testStringWithOnlyOneSpecialChar() {
        String str = "Hello! world";
        int count =StringOperations.countSpecialCharacters(str);
        assertEquals(1, count);
    }

    @Test
    public void testStringWithMultipleSpecialChars() {
        String str = "H#e@ll!o w%orl$d";
        int count = StringOperations.countSpecialCharacters(str);
        assertEquals(5, count);
    }

    @Test
    public void testStringWithAllSpecialChars() {
        String str = "!@#$%^&*()_+";
        int count = StringOperations.countSpecialCharacters(str);
        assertEquals(12, count);
    }



}
