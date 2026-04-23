package org.leetcodejava.No13_RomanToInteger;

import java.util.HashMap;

public class roman2integer {
    public int romanToInt(String s) {

        if(s == null) throw new RuntimeException("Invalid input values");

        HashMap<Character, Integer>  romanMaps = new HashMap<>();
        romanMaps.put('I', 1);
        romanMaps.put('V', 5);
        romanMaps.put('X', 10);
        romanMaps.put('L', 50);
        romanMaps.put('C', 100);
        romanMaps.put('D', 500);
        romanMaps.put('M', 1000);

        int result = 0;
        int preValue = 0;

        for(int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            Integer value = romanMaps.get(c);

            if(value == null) throw new RuntimeException("Invalid characters in the string");

            if(value < preValue) {
                result -= value;
            } else {
                result += value;
            }

            preValue = value;
        }

        return result;
    }
}
