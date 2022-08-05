//Given an integer,n, print its first 10 multiples. Each multiple nxi (where1<=i<=10 ) should be 
//printed on a new line in the form: n x i = result.

package com.Hackerrank.Kaustubh;

import java.io.*;

public class Hackerrank3 
{

	    public static void main(String[] args) throws IOException 
	    {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter the number for table: ");
	        int n = Integer.parseInt(bufferedReader.readLine().trim());
	        bufferedReader.close();
	        int result=1;
	        int i;
	        System.out.println("Table for "+n+" is");
	        System.out.println("");
	        for(i=1;i<11;i++)
	        {
	        	result=n*i;
	        	if(i<10)
	        		System.out.println(n+" x 0"+i+" = "+result);
	        	else
	        		System.out.println(n+" x "+i+" = "+result);
	        }
	        
	    }

}
