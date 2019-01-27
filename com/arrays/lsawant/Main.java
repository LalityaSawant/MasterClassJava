package com.arrays.lsawant;

public class Main {

	public static void main(String[] args) {
		/*
		 * Arrays are one type of data structures allows you to store sequence of same data type
		 * Arrays index always start with 0
		 * arrays can be of any data types like double, string, int etc
		 * exception associated with array is ArrayIndexOutOfBound when we try assigning/retrieve any value to index greater than array length
		 */
		
		//Below are the 3 methods of defining and initializing arrays
		
		//method 1 but such type of value assignment can only be done while defining array
		int[] myIntArray = {10,20,30,40,50}; 
		
		System.out.println("value of myIntArray at index 3 is " + myIntArray[3]);
		
		// method 2 initializing array
		int[] myNewIntArray = new int[5]; 
		myNewIntArray[0] = 10;
		myNewIntArray[4] = 30;
		
		System.out.println("value of myNewIntArray at index 0 is " + myNewIntArray[0]);
		System.out.println("value of myNewIntArray at index 4 is " + myNewIntArray[4]);
		
		
		//method 3 defining array  and assigning and retrieving it by for loop
		int[] myForIntArray = new int[10];
		
		for(int i=0; i<myForIntArray.length ; i++) {
			myForIntArray[i] = i*10;
		}
		
		printArray(myForIntArray);
		
					
		
	}
	
	public static void printArray(int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.println("value of array at index " + i + " is " + array[i]);
		}
		
	}

}
