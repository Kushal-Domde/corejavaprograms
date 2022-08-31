// WAJP to multiply the corresponding elements in the given two arrays

package com.w3resources.kaustubh;
public class Main36 
{
	public static void main(String[] args) 
	{
		int []a= {1, 3, -5, 4,9};
		int []b= {5, 9, 45, 14,2};
		int size=a.length;
		if(a.length==b.length)
		{
			for(int i=0;i<size;i++)
				System.out.print(a[i]*b[i]+" ");
		}
		else
			System.out.print("size didnt match of 2 arrays so can't multiply ");
	}
}
