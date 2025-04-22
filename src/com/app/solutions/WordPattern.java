package com.app.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("aaca", "dog cat cat dog"));
	}

	public static boolean wordPattern(String pattern, String s) {

		char[] letters = pattern.toCharArray();
		String[] words = s.split(" ");
		System.out.println(Arrays.toString(letters) + " " + Arrays.toString(words));

		if (letters.length != words.length) {
			return false;
		}

		/*
		 * Map<Character, String> map = new HashMap<Character, String>(); Map<String,
		 * Character> revMap = new HashMap<String, Character>(); for (int i = 0; i <
		 * letters.length; i++) {
		 * 
		 * if (map.containsKey(letters[i])) { if (!map.get(letters[i]).equals(words[i]))
		 * { return false; } } else { map.put(letters[i], words[i]); }
		 * 
		 * if (revMap.containsKey(words[i])) { if
		 * (!revMap.get(words[i]).equals(letters[i])) { return false; } } else {
		 * revMap.put(words[i], letters[i]); } }
		 */

		// MY SOL:
		
		 Map<Character, String> map = new HashMap<Character, String>();

		Set<String> strSet = new HashSet<String>();
		for (int i = 0; i < letters.length; i++) {

			if (map.containsKey(letters[i])) {
				if (!map.get(letters[i]).equals(words[i])) {
					return false;
				}

			} else if (strSet.contains(words[i])) {
				return false;
			}
			strSet.add(words[i]);
			map.put(letters[i], words[i]);
		}

		// System.out.println(map+" < == > "+revMap);
		return true;
		
		
		/* OPTIMIZED SOLUTION
		  Map<Character,String> patternMap = new HashMap<>();
        String[] words = s.split(" ");

        if(pattern.length()!=words.length){
            return false;
        }

        for(int i=0;i<pattern.length();i++){

            if(patternMap.containsKey(pattern.charAt(i))){
                if(!patternMap.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }
            else if(!patternMap.containsKey(pattern.charAt(i)) && patternMap.containsValue(words[i])){
                return false;
            }
            patternMap.put(pattern.charAt(i),words[i]);
        }
        return true;*/
		

	}

}
