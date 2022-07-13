// WAP to detect  Sign of the Product of an Array and return 1 if result is positive -1 if result is negative and zero if result is zero

package com.leetcode.kaustubh;

import java.util.Scanner;

public class Solution6 
{
    public int arraySign(int[] nums) 
    {
        int num = 1;
    	for(int n : nums){
            if(n == 0){
                num = 0;
            }
            else if(n < 0)
            {
                num = -num;
            }
        }
        return num;
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
        Solution6 s6 = new Solution6 ();  
        sc.close();
        System.out.println("sign of product in the array is::"+s6.arraySign(arr));  
    }  
}
