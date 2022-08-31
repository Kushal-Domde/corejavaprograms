//Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2.

package com.w3resources.kaustubh;
public class Main33 
{
	public static void main(String[] args) 
	{
		int[] number_array = {10, -20, 0, 30, 40, 60, 10};
		System.out.println(number_array.length-1);
		System.out.println(number_array[number_array.length-1]); 
		if(number_array[0]==10||number_array[number_array.length-1]==10)
			System.out.println("yes it consists");
	}	
}
