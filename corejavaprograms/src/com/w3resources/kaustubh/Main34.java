//WAJP to test if the first and the last element of an array of 
//integers are same. 

package com.w3resources.kaustubh;
import java.util.Arrays;
public class Main34 
{
	public static void main(String[] args) 
	{
		 int[] array = {50, -20, 0, 30, 40, 60, 50};
		 if(array[0]==array[array.length-1])
				System.out.println("yes both are same");
		 else
				System.out.println("No both are not same");
		 System.out.println(array);
	}	
}
