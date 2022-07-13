//	Given an integer number n, return the difference between the product of its digits and the sum of its digits.

package com.leetcode.kaustubh;

public class Solution4 
{
	int sum=0;
	int product=1;
	public  int subtractProductAndSum(int n) 
	{
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			product=product*d;               
			n=n/10;
		}
		int result= product-sum;
		return result;
	}
	public static void main(String[] args) 
	{
		Solution4 s=new Solution4();
		System.out.println(s.subtractProductAndSum(234));
	}
}
