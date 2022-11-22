package week2.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * Pseudo Code
  
 *Declare a String 
	String text1 = "stops";
 *Declare another St ring
	String text2 = "potss"; 
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 * 
 */
public class Anagram {

	public static void main(String[] args) {
	
		String s1="stops";
		String s2="potss";
		char c1[],c2[];
		
		
		if(s1.length() == s2.length())
		{
			c1 =  s1.toCharArray();
			c2 = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(c1);
			System.out.println(c2);
			
			
			for(int i=0; i<=c1.length-1; i++)
			{
				if(c1[i] == c2[i])
					continue;
				else 
					System.out.println("the given string is not an anagram");
				
			}
			
			System.out.println("the both given string is an anagram: "+s1+" : "+s2);
				
		}
		
		
		}
	

}
