package com.bptn.course._03_flow_control._02_for_loop;

public class PrintEventFrom0To100 {

	public static void main(String[] args) {
		// Approach 1: Increment by 2 to print even numbers
		for (int i = 2; i <= 100; i += 2) {  // Incrementing by 2
			System.out.println(i);
		}
		
		// Approach 2: Using modulus to check for even numbers
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}