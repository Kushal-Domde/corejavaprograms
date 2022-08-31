//Write a Java program to check if the value 20 appears three times and no 20’s are next to each other in a given array of integers.
package com.w3resources.kaustubh;

public class Main43 
{
		public static void main(String[] args) 
		{
			int[] array_nums = {10, 70,20,80,50,20,13, 50,20,};
		    boolean find1 = false;
		    boolean find2 = false;
		    int count=0;
		    int y = 20;
		    for(int i = 0; i < array_nums.length; i++) 
		    {
		    	if(array_nums[i] == y)
		    	{
		    		count++;
		    		System.out.println("Position of occurence is: "+i);
		    	}
		    }
		    System.out.println(count);
	}
}
