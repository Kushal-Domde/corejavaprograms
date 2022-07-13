//Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area

package com.leetcode.kaustubh;

import java.util.Arrays;
import java.util.Scanner;

public class Solution5 
{
	public int largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);
        int n= nums.length;
        for (int i =n - 1; i > 1; --i)
        if (nums[i] < nums[i - 1] + nums[i - 2])
                return nums[i] + nums[i - 1] + nums[i - 2];
        return 0;
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
	        Solution5 s5 = new Solution5();  
	        sc.close();
	        System.out.println("the largest perimeter of a triangle is::"+s5.largestPerimeter(arr));  
	     
	}
}
