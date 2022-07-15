//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

package com.leetcode.kaustubh;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution9 
{

	public boolean containsDuplicate(int[] nums) 
    {
             
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) 
        {
            if (!uniques.add(num)) 
            {
                return true;
            }
        }
        return false;
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
        Solution9 s9 = new Solution9();  
        sc.close();
        System.out.println(s9.containsDuplicate(arr));  
    }  

}
