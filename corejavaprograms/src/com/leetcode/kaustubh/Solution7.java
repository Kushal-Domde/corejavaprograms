//Given an array of distinct integers nums, find all pairs of elements with the minimum absolute difference of any two elements.

package com.leetcode.kaustubh;

import java.util.*;

public class Solution7 
{
	public List<List<Integer>> minimumAbsDifference(int[] nums) 
	{
		int min = Integer.MAX_VALUE;
		int n = nums.length;

		List<List<Integer>> res = new ArrayList<>();

		Arrays.sort(nums);

		for(int i = 0; i < n - 1; i++)
			min = Math.min(min, nums[i+1] - nums[i]);

		for(int i = 0; i < n - 1; i++)
			if( min == nums[i + 1] - nums[i])
				res.add(Arrays.asList(nums[i], nums[i + 1]));

		return res;
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
		Solution7 s7 = new Solution7();  
		sc.close();
		System.out.println("All pairs of elements with the minimum absolute difference of any two element is :"+s7.minimumAbsDifference(arr));  
	}  

}
