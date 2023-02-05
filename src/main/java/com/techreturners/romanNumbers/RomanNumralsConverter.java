package com.techreturners.romanNumbers;

public class RomanNumralsConverter {

    public String convert(int number) {
    	int[] values = {5,4,1};
        String[] romanNumbers = {"V","IV","I"};
    	
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