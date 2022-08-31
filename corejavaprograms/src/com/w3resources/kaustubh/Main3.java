// Wap to convert decimal number to binary

package com.w3resources.kaustubh;
import java.util.*;
public class Main3 
{
	    public static void main(String[]args)
	    {
	        String binarynumber="";
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter the decimal number to be converted:");
	        int decimalnumber=scanner.nextInt();
	        scanner.close();
	        int temporary=decimalnumber;
	        while(temporary>0)
	        {
	          int remainder=temporary%2;
	          temporary=temporary/2;
	          binarynumber=binarynumber+remainder;
	        }
	        System.out.println("Equivalent binary of "+decimalnumber+" is "+binarynumber); 
	    }
}
