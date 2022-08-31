// program to add and multiply two binary numbers

package com.w3resources.kaustubh;
import java.util.Scanner;
public class Main2 
{
	  public static void main(String[] args) 
	  {
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("Enter the first binary number: ");
	    String s1=scanner.nextLine();
	    System.out.println("Enter the Second binary number: ");
	    String s2=scanner.nextLine();
	    int n1=Integer.parseInt(s1,2);
	    int n2=Integer.parseInt(s2,2);
	    int sum= n1+n2;
	    int product= n1*n2;
	    System.out.println("Sum is ");
	    System.out.println(Integer.toBinaryString(sum));
	    System.out.println("Product is ");
	    System.out.println(Integer.toBinaryString(product));
	  }
}
