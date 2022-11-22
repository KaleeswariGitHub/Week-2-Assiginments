package week2.day2;
//Build a logic to find the given string is palindrome or not

/*
 * Pseudo Code

 * a) Declare A String value as"madam"
 
 * b) Declare another String rev value as ""
 * c) Iterate over the String in reverse order
 * d) Add the char into rev
 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
 */
public class PalindromeLesson {

	public static void main(String[] args) {
		
		String inputString = "pip";
		String reverseString ="";
		char[] getStringArray = inputString.toCharArray();
		int lenString = getStringArray.length;
		System.out.println("The given string is: "+inputString);
		for(int i= lenString-1;i>=0;i--)
		{
			reverseString = reverseString + getStringArray[i];
		}
		
		System.out.println("reversed string is: "+ reverseString);
		
		if(inputString.equalsIgnoreCase(reverseString))
			System.out.println("The " +inputString+ " is palindrome");
		else
			System.out.println("The " +inputString+ " is not palindrome");

	}

}
