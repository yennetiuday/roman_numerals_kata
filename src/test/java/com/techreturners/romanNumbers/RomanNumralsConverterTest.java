package com.techreturners.romanNumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
    
    @Test
    public void convertFiveToNumeral(){
        RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("V", converter.convert(5));
    }
    
    @Test
    public void convertFourToNumeral(){
        RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("IV", converter.convert(4));
    }
}