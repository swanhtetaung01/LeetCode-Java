package org.leetcodejava.No20_ValidParentheses;

import java.util.HashMap;

public class ValidParentheses {
    public boolean isValid(String s) {

        HashMap<Character, Character> charMap= new HashMap<Character, Character>();

        charMap.put('(' , ')');
        charMap.put('{' , '}');
        charMap.put('[' , ']');

        for(int i = 0 ; i < s.length() ; i++) {
            if(charMap.containsKey(s.charAt(i)) && s.charAt(i-1) == )
        }
    }
}
