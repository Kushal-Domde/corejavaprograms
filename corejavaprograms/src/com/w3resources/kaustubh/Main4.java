//Wap to convert decimal number to hexadecimal

package com.w3resources.kaustubh;
import java.util.Scanner;
public class Main4 
{
	public static void main(String[]args)
	{
	     char[]hexadecimal=new char[200];
	     int i=0;
	     Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter the decimal number to be converted:");
	     int decimalnumber=scanner.nextInt();
	     scanner.close();
	     int temporary=decimalnumber;
	     while(temporary!=0)
	     {
	       int remainder=temporary%16;
	       if(remainder<10)
	         remainder=remainder+48;
	       else
	         remainder=remainder+55;
	       hexadecimal[i] = (char)remainder;
	       i++;
	       temporary=temporary/16;
	     } 
	     System.out.println("Equivalent hexadceimal of "+decimalnumber+" is");
	     for(i=i-1;i>=0;i--)
	     {
	        System.out.print(hexadecimal[i]);
	     }
	}
}

