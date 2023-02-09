package com.techreturners.romanNumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RomanNumralsConverterTest {
	
	private RomanNumralsConverter converter;
	
	@BeforeEach
	public void setUp() {
		converter = new RomanNumralsConverter();
	}

    @Test
    public void convertOneToNumeral(){
        assertEquals("I", converter.convert(1));
    }

    @Test
    public void convertTwoToNumeral(){
        assertEquals("II", converter.convert(2));
    }
    
    @Test
    public void convertFiveToNumeral(){
        assertEquals("V", converter.convert(5));
    }
    
    @Test
    public void convertFourToNumeral(){
        assertEquals("IV", converter.convert(4));
    }
    
    @Test
    public void convertEightToNumeral(){
        assertEquals("VIII", converter.convert(8));
    }
    
    @Test
    public void convertTenToNumeral() {
        assertEquals("X", converter.convert(10));
    }
    
    @Test
    public void convertNineToNumeral() {
        assertEquals("IX", converter.convert(9));
    }
    
    @Test
    public void convertThirtyNineToNumeral() {
        assertEquals("XXXIX", converter.convert(39));
    }
    
    @Test
    public void convertFortyToNumeral() {
        assertEquals("XL", converter.convert(40));
    }
    
    @Test
    public void convertFiftyToNumeral() {
        assertEquals("L", converter.convert(50));
    }
    
    @Test
    public void convertEightyNineToNumeral() {
        assertEquals("LXXXIX", converter.convert(89));
    }
    
    @Test
    public void convertNintyToNumeral() {
        assertEquals("XC", converter.convert(90));
    }
    
    @Test
    public void convertNintyFiveToNumeral() {
        assertEquals("XCV", converter.convert(95));
    }
    
    @Test
    public void convertHundredToNumeral() {
        assertEquals("C", converter.convert(100));
    }
    
    @Test
    public void convertThreeNintyNineToNumeral() {
        assertEquals("CCCXCIX", converter.convert(399));
    }

    @Test
    public void convertFourHundredToNumeral() {
        assertEquals("CD", converter.convert(400));
    }
    
    @Test
    public void convertFiveHundredToNumeral() {
        assertEquals("D", converter.convert(500));
    }
    
    @Test
    public void convertEightNintyNineToNumeral() {
        assertEquals("DCCCXCIX", converter.convert(899));
    }

    @Test
    public void convertNineHundredToNumeral() {
        assertEquals("CM", converter.convert(900));
    }
    
    @Test
    public void convertNineHundredFiftyToNumeral() {
        assertEquals("CML", converter.convert(950));
    }
    
    @Test
    public void convertThousandToNumeral() {
        assertEquals("M", converter.convert(1000));
    }
    
    @Test
    public void convertThousandNintyNineToNumeral() {
        assertEquals("MXCIX", converter.convert(1099));
    }
    
    @Test
    public void convertThreeThousandToNumeral() {
        assertEquals("MMM", converter.convert(3000));
    }
    
    @Test
    public void convertThreeThousandNineNintyNineToNumeral() {
    	IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> converter.convert(3999));
        assertEquals("Number should be between 1 and 3000", exception.getMessage());
    }
}