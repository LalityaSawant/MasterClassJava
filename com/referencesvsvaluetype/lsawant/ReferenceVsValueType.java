package com.referencesvsvaluetype.lsawant;

import java.util.Arrays;

//Primitive types are value types
//array is reference types and string is reference type
// whenever new key word is used it becomes reference type like new int[] , new object() string internally does the same; 

public class ReferenceVsValueType {

	public static void main(String[] args) {
		// value type
		int myValue = 10;
		int myNewValue = myValue;
		
		System.out.println("myValue : " + myValue);
		System.out.println("myNewValue : " + myNewValue);
		
		myNewValue ++;

		System.out.println("myValue : " + myValue);
		System.out.println("myNewValue : " + myNewValue);
		
		System.out.println("--now lets see nonprimitive datatype likea arrays----");
		
		int[] myIntArray = new int[5];
		int[] myNewIntArray = myIntArray;
		
		System.out.println("myIntArray= " + Arrays.toString(myIntArray));
		System.out.println("myIntArray= " + Arrays.toString(myNewIntArray));
		
		myNewIntArray[3] = 4;
		System.out.println("---After cahnging value-------");
		
		System.out.println("myIntArray= " + Arrays.toString(myIntArray));
		System.out.println("myIntArray= " + Arrays.toString(myNewIntArray));
		
		System.out.println(myIntArray);
		System.out.println(myNewIntArray);
		
		modifyarray(myIntArray);
		
		System.out.println(myIntArray);
		System.out.println(myNewIntArray);
		System.out.println("myIntArray= " + Arrays.toString(myIntArray));
		System.out.println("myIntArray= " + Arrays.toString(myNewIntArray));
	}
	
	private static void modifyarray(int[] array) {
		System.out.println("----in modifyArray()------");
		System.out.println(array);
		System.out.println("myIntArray= " + Arrays.toString(array));
		array[0] = 2;
		array = new int[] {1,2,3,4,5};
		System.out.println("----------");
		System.out.println(array);
		System.out.println("myIntArray= " + Arrays.toString(array));
	}

}
