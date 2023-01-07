//WAJP to Implement Shape Interface using Circle and Rectangle Class

package com.kaustubh.classobject;

public interface Shape 
{
	void input();
	 void area();
}
class circle implements Shape
{
	double radius=0.0;
	double areaOfCircle;
	public void input()
	{
		radius=5.5;
	}
	public void area()
	{
		areaOfCircle= 3.14*radius*radius;
		System.out.println("Area of circle is "+areaOfCircle);
	}
}
class Rectangle extends circle
{
	double length=0.0;
	double breadth=0.0;
	double areaOfRectangle;
	public void input()
	{
		super.input();
		length=5.6;
		breadth=7.5;
	}
	public void area()
	{
		super.area();
		areaOfRectangle= 2*length*breadth;
		System.out.println("Area of Rectangle is "+areaOfRectangle);
	}
}
	
