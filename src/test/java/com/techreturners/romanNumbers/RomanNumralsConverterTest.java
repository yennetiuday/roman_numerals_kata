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
    
    @Test
    public void convertThirtyNineToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("XXXIX", converter.convert(39));
    }
    
    @Test
    public void convertFortyToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("XL", converter.convert(40));
    }
    
    @Test
    public void convertFiftyToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("L", converter.convert(50));
    }
    
    @Test
    public void convertEightyNineToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("LXXXIX", converter.convert(89));
    }
    
    @Test
    public void convertNintyToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("XC", converter.convert(90));
    }
    
    @Test
    public void convertHundredToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("C", converter.convert(100));
    }
    
    @Test
    public void convertThreeNintyNineToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("CCCXCIX", converter.convert(399));
    }
    

    
    @Test
    public void convertFourHundredToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("CD", converter.convert(400));
    }
    
    @Test
    public void convertFiveHundredToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("D", converter.convert(500));
    }
    
    @Test
    public void convertEightNintyNineToNumeral() {
    	RomanNumralsConverter converter = new RomanNumralsConverter();
        assertEquals("DCCCXCIX", converter.convert(899));
    }
}