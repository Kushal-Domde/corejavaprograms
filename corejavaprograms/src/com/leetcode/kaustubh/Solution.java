//WAP Return the average salary of employees excluding the minimum and maximum salary.

package com.leetcode.kaustubh;

import java.util.Scanner;

public class Solution
{
	public double average(int[] salary) 
	{
		int n=salary.length;
		double max=Double.MIN_VALUE;
		double min=Double.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<salary[i])
			{
				max=salary[i];
			}
			if(min>salary[i])
			{
				min=salary[i];
			}
		}
		double sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=salary[i];
		}
		int x=n-2;
		double ans=sum-max-min;
		double avg=ans/x;
		return avg;
	}
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the array range: ");  
		int size = sc.nextInt();  
		int[] arr = new int[size];  
		System.out.println("Enter the elements of the array :");  

		for(int i=0; i<size; i++) {  
			arr[i] = sc.nextInt();  
		}  
		Solution s = new Solution();  
		sc.close();
		System.out.println("The average salary of employees excluding the minimum and maximum salary is "
				+ ":"+s.average(arr));  
	}  



	        
	        
	    

}
