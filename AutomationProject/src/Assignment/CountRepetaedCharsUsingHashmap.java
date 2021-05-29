package Assignment;

import java.util.HashMap;

public class CountRepetaedCharsUsingHashmap {

	public static void main(String[] args) {
		
		String s="ojasinnovativetechnologies";
		int count;
		char ch;
	//	System.out.println(s.length());
		HashMap<Character,Integer> hashmap=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(!hashmap.containsKey(ch))
			{
				
				count=hashmap.get(ch);
				count++;
				hashmap.replace(ch, count);
				
			}
			else {
				hashmap.put(ch, 1);
			}
		}
		
		for(Character key: hashmap.keySet()) 
			System.out.println(key+" = "+hashmap.get(key));
		    
	}

}
