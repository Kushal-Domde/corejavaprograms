//WAJP to insert a word in the middle of the another string.
package com.w3resources.kaustubh;
import java.util.Scanner;
public class Main27
{
	public static void main(String[] args) 
	{
		String firstName="Kaustubh";
		String lastName="Domde";
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter middle name:");
		String middleName=scanner.nextLine();
		scanner.close();
		System.out.println(firstName+" "+middleName+" "+lastName);
	}
}
