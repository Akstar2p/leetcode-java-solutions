package com.app.solutions;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
	 public boolean canConstruct(String ransomNote, String magazine) {
	        
	        
	        Map<Character,Integer> rFreqMap = new HashMap<>();
	        Map<Character,Integer> mFreqMap = new HashMap<>();

	        char[] ransomArr = ransomNote.toCharArray();
	        char[] magArr = magazine.toCharArray();

	        for(char c: ransomArr){
	            rFreqMap.put(c, rFreqMap.getOrDefault(c,0)+1);
	        }

	        for(char c: magArr){
	            
	         mFreqMap.put(c, mFreqMap.getOrDefault(c,0)+1);

	        }
	        return (rFreqMap.entrySet()
	        .stream()
	        .noneMatch(e-> mFreqMap.getOrDefault(e.getKey(),0)<e.getValue()));
	       
	        // .filter((e)->!mFreqMap.containsKey(e.getKey())&& mFreqMap.get(e.getKey())<=e.getValue())
	        // .count()>0);
	               
	            
	      
	        // mFreqMap.forEach((k,v)->{
	        //     if((rFreqMap.containsKey(k))&& (rFreqMap.get(k)<=v)){
	        //         result = true;
	        //     }
	        // });
	       

	    
	    }
}
