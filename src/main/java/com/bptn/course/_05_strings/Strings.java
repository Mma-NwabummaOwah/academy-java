package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		// to create a new string
				String s = "Hello World";
				
				String reversedWord ="";
				// find the total length of the string and store it inside a variable
				String sub = s.substring(0,8);
				System.out.println(" The substring will start index 0 and wnd index 8: "+ sub);
				String sub1 = s.substring(3);
				System.out.println(" the substring will start index 3 " + sub1);
				// toLowercase() - converts all the letters of the string to lowercase
				
				String lowerCaseString  = s.toLowerCase();
				System.out.println(" The lowercase string is: " + lowerCaseString);
				
				//toUpperCase() - converts all the letters of the string to uppercase
				
				String upperCaseString  = s.toUpperCase();
				System.out.println(" The uppercase string is: " + upperCaseString);
				
				int index = s.indexOf("World");
				System.out.println(" The index of World is: " + index);
				
				// find the character at the specified index- 3
				
				char c1 = s.charAt(3);
				System.out.println(" The character at index 3: " + c1);
				
				for (int i=s.length()-1 ;i>=0; i--) {
					reversedWord += s.charAt(i);
					
				}
				
				System.out.println("Reversed word: "+ reversedWord);
				
	}
}
