package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {
		//Declare and initiate an array with a value
		int[] myArray = {3,5,7,9,11,13};
		System.out.println("First element: " + myArray[0]);
		System.out.println("Second element: " + myArray[1]);
		
		//Update the first element to 30
		myArray[0] = 30;
		System.out.println("Updated first element: " + myArray[0]);
		
		//Update the last element of the array using the length property without directly using the index
		
		myArray[myArray.length-1] = 130;
		System.out.println("Updated last element: " + myArray[myArray.length-1]);
		
		// Print the elements of an array one by one using FOR LOOP
		
		// print values from 1 to 10
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
			
		// Print all the elements in an array (Traditional for loop)
		
		for(int i= 0; i<myArray.length ; i++) {
			System.out.println(myArray[i]);
			
		}
		
		// print the elements in the array in the reverse order using FOR LOOP
			
		for(int i = myArray.length-1; i>=0; i--) {
			System.out.println(myArray[i]);
			
		}
		// Using the FOR EACH LOOP for an enhanced FOR LOOP
		
		// To print out all the elements in an array without having to list them out
		// you can also use it to access elements in an array when you don't have the index
		
		for(int element:myArray) {
			System.out.println(element);
			
		}
		//How to print the element in the myArray without using loop.
		// This code will print out the reference memory location of the array and not what is stored in the array
		
		System.out.println(myArray);
		
		//
	}
}
