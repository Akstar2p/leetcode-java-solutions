package com.app.solutions;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicStrings290 {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("foo", "bar"));

	}
	 public static boolean isIsomorphic(String s, String t) {

	        char[] sArr = s.toCharArray();
	        char[] tArr = t.toCharArray();

	        if(s.length()!=t.length()) {
	        	return false;
	        }
	        
	        Map<Character,Character> isoMap = new HashMap<Character, Character>();
	        for(int i =0; i<sArr.length;i++) {
	        	 //if key is already there, the value should not be different
	        	if(isoMap.containsKey(sArr[i]) && isoMap.get(sArr[i])!=tArr[i]) {
	        		return false;
	        	} 
	        	 //if key is not there in the first place, map should not have this value already mapped to other key 
	        	else if(!isoMap.containsKey(sArr[i])&& isoMap.containsValue(tArr[i])) {
	        		return false;
	        	}
	        	isoMap.put(sArr[i], tArr[i]);
	        }

			return true;

	        
	    }

}
