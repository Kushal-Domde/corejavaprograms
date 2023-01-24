// //WAJP to display no of objects created

package com.kaustubh.statickey;

public class CountObject 
{
	static int count=0;
	CountObject()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		CountObject countObject=new CountObject();
		CountObject countObject1=new CountObject();
		CountObject countObject2=new CountObject();
		
	}
}
