//Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.
package com.w3resources.kaustubh;
public class Main42 
{
	public static void main(String[] args) 
	{
		int[] array_nums = {10, 70, 80, 50, 13, 50};
	    boolean find1 = false;
	    boolean find2 = false;
	    int result=0;
	    int x = 10;
	    int y = 20;
	    for(int i = 0; i < array_nums.length; i++) 
	    {
	    	if(array_nums[i] == x)
	    	{
	    		System.out.println("find1");
	    		find1 = true;
	    		if(array_nums[i] == y)
	    		{
		    		System.out.println("find2");
	    			find2=true;
	    	    	result = 1;
	    		}
	
	    	}
	    }
	    if (result==0)                             
	    	System.out.println("Not found");
	    else
	    	System.out.println("found");
	 }
}