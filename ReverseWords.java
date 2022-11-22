package week2.day2;

import java.util.Arrays;
import java.util.Iterator;

/*
 * //Build a logic to reverse the even position words (output: I ma a erawtfos tester)

	

			/* Pseudo Code:
			 
			 * Declare the input as Follow
		      		String test = "I am a software tester"; 
			a) split the words and have it in an array
			b) Traverse through each word (using loop)
			c) find the odd index within the loop (use mod operator)
			
			d)split the words and have it in an array
			
			e)print the even position words in reverse order using another loop (nested loop)
			f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
			
 */
public class ReverseWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] splitWord = test.split("\\s");


		for (int i = 0; i < splitWord.length; i++) 
		{
			char[] c1 = splitWord[i].toCharArray();
			char[] c2=new char[splitWord[i].length()];
			char c3;
			
			
			if(i%2==1)
			{
				
				for(int j =0;j<=splitWord[i].length()-1;j++)
				{
					
					   c3 = c1[(splitWord[i].length()-1)-j];
					   c2[j]=c3;
				}
				String string = String.valueOf(c2);
				
				splitWord[i]= string;	
			}
			
		}
		for(String var :splitWord)
		{
			System.out.println(var);
		}
			
		}

	}
