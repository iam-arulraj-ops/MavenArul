package com.handles;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWord1 {

	public static void main(String[] args) {

		
		String str="this topic is all about java and java is a platform independent because java is a object oriented programming language in which the topic deals with selenium";
	
		String words[] = str.split(" ");
		
		Map<String,Integer> map= new HashMap<>();
		
		for(String w:words) {
			
			if(map.containsKey(w)) {
				Integer it=map.get(w);
				map.put(w, it+1);
			}
			else {
				map.put(w,1);
			}
		}
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		System.out.println("Repeated word in a given String");
		
		Set<Entry<String,Integer>> entrySet= map.entrySet();
		
		for(Entry<String,Integer> entry:entrySet) {
			
			if(entry.getValue()>0) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
	}

}
