package com.techreturners.romanNumbers;

public class RomanNumralsConverter {

    public String convert(int number) {
        String result = "";
        for(int i=0; i< number; i++) {
            result += "I";
        }
        return result;
    }
}
