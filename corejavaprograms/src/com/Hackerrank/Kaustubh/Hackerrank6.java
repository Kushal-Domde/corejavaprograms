//Write a Java program to calculate Largest sum of hourglass in  2D Array 

package com.Hackerrank.Kaustubh;

import java.util.Scanner;
public class Hackerrank6 
{
	  private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	        int[][] arr = new int[6][6];
	        System.out.println("Enter the elements to be inserted:");
	        for (int i = 0; i < 6; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	            }
	        }
	    int csum =Integer.MIN_VALUE;
	        for(int i=0;i<6;i++)
	        {
	            for(int j=0;j<6;j++)
	            { 
	                if(i>1 && j>1)
	                {
	                    int sum=arr[i][j]+arr[i-1][j-1]+arr[i-2][j]+arr[i-2][j-1]
	                    +arr[i-2][j-2]+arr[i][j-1]+arr[i][j-2];
	                    
	                    if(sum>csum)
	                    {
	                        csum=sum;
	                    }
	                }
	            }
	        }
	        System.out.println("Largest sum of hourglass is:");
	        System.out.print(csum);
	        scanner.close();
	    }
}



