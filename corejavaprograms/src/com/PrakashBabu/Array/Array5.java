//WAP to to find Minimum elements in  the ARRAY

package com.PrakashBabu.Array;

public class Array5 {

	public static void main(String[] args)
	{
		int a[]= {23,07,1994,1000000,11};
		int i;
		int min=a[0];
		System.out.println("Element in the array is: ");
		for(int j:a)
			System.out.println(j);
		for(i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Smallest element in the array is: "+min);
	}
}
