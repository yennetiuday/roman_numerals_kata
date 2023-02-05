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
    
    @Test
    public void convertEightToNumeral(){
        RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("VIII", converter.convert(8));
    }
    
    @Test
    public void convertTenToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("X", converter.convert(10));
    }
    
    @Test
    public void convertNineToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("IX", converter.convert(9));
    }
}