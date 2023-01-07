package com.kaustubh.constructor;

public class ConstructorImplementer 
{
	public static void main(String[] args) 
	{
		ConstructorDemo constructorDemowith =new ConstructorDemo(94,65,78);
		double percent=constructorDemowith.percentage();
		System.out.println("percentage is " + percent);
		ConstructorDemo constructorDemowithout =new ConstructorDemo();
		double area=constructorDemowithout.areaOfRectangle();
		System.out.println("Area of Rectangle is "+area);
	}
}
