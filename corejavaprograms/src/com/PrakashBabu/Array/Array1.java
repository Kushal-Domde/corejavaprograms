// WAP to read and write the elements into the array

package com.PrakashBabu.Array;
import java.util.*;

public class Array1 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);		
		System.out.println("Please enter the array size:");
		int n=scanner.nextInt();
		int num[]=new int[n];
		System.out.println("Please enter value of "+n+ " elements");
		for (int i=0;i<n;i++)
		{
			num[i]=scanner.nextInt();
		}
		System.out.println(n+"Elements in array are: ");
		for(int i:num)
		{
			System.out.println(i);
		}
	}
}
