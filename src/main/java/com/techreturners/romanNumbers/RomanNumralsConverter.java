package com.techreturners.romanNumbers;

public class RomanNumralsConverter {

    public String convert(int number) {
    	int[] values = {500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNumbers = {"D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    	
        StringBuilder result = new StringBuilder();
        for(int i=0; i< values.length; i++) {
        	while(number >= values[i]) {
        		number -= values[i];
        		result.append(romanNumbers[i]);
        	}
        }
        return result.toString();
    }
}