package com.arrays.lsawant;

import java.util.Scanner;

public class ArrayExample2 {

	//defining scanner
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] myIntegers = getIntigers(5);
		
		printArray(myIntegers);
		System.out.println("the average of all your numbers entered is " + getaverage(myIntegers));
		
	}
	
	public static double getaverage(int[] array) {
		int sum =0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		return (double)sum/(double)array.length;
	}
	
	public static void printArray(int[] array) {
		for (int i =0; i<array.length;i++) {
			System.out.println("the value entered at " + i + " was "+ array[i]);
		}
	}
	
	public static int[] getIntigers(int number) {
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];
		for (int i=0;i<values.length;i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
		
	}

}
