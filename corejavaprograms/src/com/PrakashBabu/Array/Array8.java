//WAP to do sum of even elements in  the ARRAY


package com.PrakashBabu.Array;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) 
	{
			int a[]= {12,45,23,07,1000000};
			int element;
			for(int i:a)
				System.out.println("Elements in Array are: "+i);
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter the element to be searched ");
			element=scanner.nextInt();
			boolean found=false;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==element)
					found=true;
					//System.out.println("Element to be searched is found: "); why these line is printing n times
			}
			System.out.println((found)?"Element found":"Not found");
	}

}
