
package com.bptn.course._13_builtin_exceptions_02_unchecked_exception;

public class BuiltinExceptionExample {
	
	//create a method- which checks if the number of positive or negative
	//throws- always comes in the method signature which warns that this
	//method has the ability to encounter a situation and should be in a position to handle it
	
	public static void checkPositive(int number) throws IllegalArgumentException{
		
		if(number<0) {
			throw new IllegalArgumentException("The number must be positive");
		}
		
		System.out.println("The number is positive");
		
	}

	public static void main(String[] args) {
		
		
		try {
			checkPositive(10); //this call is expected to be fine
			checkPositive(-10); 
		}
		catch(IllegalArgumentException e) {
			
			System.out.println("Caught an exception: "+ e.getMessage());
		}
		

	}

}


//IllegalArgumentException is a sub class of RuntimeException
//RuntimeException is a sub class of Exception
//throws- always comes in the method signature to declare that method can throw one or more exceptions
//throws is optional in case of unchecked exception
//throws is used in case of checked exception (custom exception which is created as a checked exception)
//throw is used explicitly within a method or block of code
//throw creates an instance of Exception(or sub-classes) it tries to signal the program that something has gone wrong
