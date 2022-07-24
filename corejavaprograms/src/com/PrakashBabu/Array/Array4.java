// WAP to Max elements in  the ARRAY

package com.PrakashBabu.Array;

public class Array4 {

	public static void main(String[] args) 
	{
		int a[]= {23,07,1994,1000000,11};
		int i;
		int max=a[0];
		System.out.println("Element in the array is: ");
		for(int j:a)
			System.out.println(j);
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Max element in the array is: "+max);// Max element in the array is: 1000000
		// why not next line
	}

}
