// Given a list of integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space 
//   separated integers.

package com.Hackerrank.Kaustubh;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Hackerrank12 
{
	public static void main(String[] args) 
	{
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter no of elements u want to insert");
			int n= scanner.nextInt();
			List<Integer>list= new LinkedList<Integer>();
			System.out.println("Elements u want to insert are");
			for(int i=0;i<n;i++)
			{
				list.add(scanner.nextInt());
			}
			System.out.println("Enter no of operations u want to perform");
			int q=scanner.nextInt();
			for(int i=0;i<q;i++)
			{
				System.out.println("Enter querry u want to perform Insert or Delete");
				String command= scanner.next();
				if(command.equals("Insert"))
				{	
					System.out.println("Enter index position at which u want to insert element");
					int x= scanner.nextInt();
					System.out.println("Enter elements u want to insert");
					int y= scanner.nextInt();
					list.add(x,y);
				}
				if(command.equals("Delete"))
				{
					System.out.println("Enter index position at which u want to delete element");
					int index= scanner.nextInt();
					list.remove(index);
				}
				else
					System.out.println("Invalid operation");

			}
			scanner.close();
			for(int i:list)
				System.out.print(i+" ");
	}
}

