//Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

package com.leetcode.kaustubh;

public class Solution3 
{
	public static int hammingWeight(int n) 
	{
		int count=0;
		while(n!=0)
		{
			n=n&(n-1);
			count+=1;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(hammingWeight( 00000000000000000000000000001011));
	}
}

