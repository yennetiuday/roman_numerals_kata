package com.techreturners.romanNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumralsConverterTest {

    @Test
    public void convertOneToNumeral(){
        RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("I", converter.convert(1));
    }

    @Test
    public void convertTwoToNumeral(){
        RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("II", converter.convert(2));
    }
}