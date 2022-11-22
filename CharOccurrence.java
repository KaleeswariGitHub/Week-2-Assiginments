package week2.day2;

import java.util.Arrays;

//Check number of occurrences of a char (eg 'e') in a String

			//String str = "welcome to chennai";

			// declare and initialize a variable count to store the number of occurrences
			
			// convert the string into char array
				
			//get the length of the array
				
			// traverse from 0 till the array length 
				
				// Check the char array has the particular char in it 
			
				// if is has increment the count
					 
				
				// print the count out of the loop
					

public class CharOccurrence {

	
	public static void main(String[] args) {
		
		String s1= "Welcome to chennai";
		int n=0;
		int k; 
		char[] c1= s1.toCharArray();
		int lenChar = c1.length;
		
		for(int i=0;i<= lenChar-1;i++)
		{
			if(c1[i] == 'e')
				n++;
		}
		
		System.out.println("Character 'e': "+ n);
		
		
		
	}
}
