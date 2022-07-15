// Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

package com.leetcode.kaustubh;

import java.util.Arrays;
import java.util.Scanner;

public class Solution8 
{
	public boolean canMakeArithmeticProgression(int[] arr) 
	{
	     Arrays.sort(arr);
	        int d= arr[1]-arr[0];
	        for(int i=2;i<arr.length;i++)
	        {
	             if(arr[i]-arr[i-1]!=d)
	                 return false;
	        }
	        return true;           
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
        Solution8 s8 = new Solution8();  
        sc.close();
        System.out.println(s8.canMakeArithmeticProgression(arr));  
    }  
}
