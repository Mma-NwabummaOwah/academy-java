<<<<<<< HEAD

=======
>>>>>>> f4be477c6648e1fc85e3bec3854cf15f9852bbfd
package com.bptn.course._04_arrays;

public class FindOddPosInArray {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		int[] numbers = {10,20,30,40,50};
		
		System.out.println("At odd indexes,the elements are: ");
		
		//Approach 1
		for(int i =1; i<numbers.length ; i+=2) {
			System.out.println(numbers[i]);
		}
		
		//Approach 2
		for(int i=0; i<numbers.length;i++) {
			
			if(i%2!=0) {
				
				System.out.println(numbers[i]);
			}
		}
		
	}

}

//i=0,1,2,3,4

//Odd indexes= 1,3 => 20,40

//1,3,5,7..


//12/2==> 6 ==> Quotient

//12%2==>0 --> Remainder
=======
		int[] numbers = {10, 20, 30, 40, 50};
		System.out.println("At odd indexes, the elements are: ");
		
		// Approach 1: Using step increment by 2
		for (int i = 1; i < numbers.length; i += 2) {  // corrected condition
			System.out.println(numbers[i]);
		}
		
		// Approach 2: Checking if index is odd
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 != 0) {
				System.out.println(numbers[i]);
			}
		}

	}
}
>>>>>>> f4be477c6648e1fc85e3bec3854cf15f9852bbfd
