


package com.challange.arrays.lsawant;

import java.util.Arrays;
import java.util.Scanner;

//test with 50,160,40,23,200

public class SortedArray {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] myarray = getIntegers(5);
		printArray(myarray);
		System.out.println("-------After sorting-------");
		printArray(sortIntegers(myarray));
				
	}
	
	public static int[] getIntegers(int numbers) {
		System.out.println("Enter " + numbers + " numbers for sorting : \r");
		int[] values = new int[numbers]; 
		for(int i=0;i<numbers;i++) {
			values[i] = scanner.nextInt();
			}
		return values;
	}
	
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Your value at index " + i + " is " + array[i]);
		}
	}
	
	//1,2,3,4,5
	public static int[] sortIntegers(int[] array) {
		//int[] sortedArray = new int[array.length];				 
			
		/*for(int i=0;i<array.length;i++) {
			sortedArray[i]= array[i];
		}*/
				
		//or as below
		int[] sortedArray = Arrays.copyOf(array, array.length);
		
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i=0;i<sortedArray.length-1;i++) {
				if(sortedArray[i]<sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1]  = temp;
					flag = true;
				}
			}
		}
		
		
		return sortedArray;
	}

}
