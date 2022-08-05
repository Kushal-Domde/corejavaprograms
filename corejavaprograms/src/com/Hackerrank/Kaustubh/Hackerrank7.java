//WAP to insert number of elements entered by user and display it
package com.Hackerrank.Kaustubh;

import java.util.Scanner;

public class Hackerrank7 
{
	   public static void main(String[] args) 
	   {
	        Scanner  scanner= new Scanner(System.in);
	        System.out.println("Enter the number of elements to be inserted:");
	        int n=scanner.nextInt();
	        int[] arr= new int[n];
	        System.out.println("Enter the elements to be inserted:");
	        for(int i=0;i<n;i++)
	        	arr[i]=scanner.nextInt();
	        scanner.close();
	        System.out.println("Elements in array is:");
	        for(int j:arr)
	        	System.out.println(j);
	    }
}
