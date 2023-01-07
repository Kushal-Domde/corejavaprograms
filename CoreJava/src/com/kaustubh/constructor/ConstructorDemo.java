// WAJP to demonstrate default and parameterized constructor 

package com.kaustubh.constructor;

public class ConstructorDemo 
{
	float length;
	float breadth;
	float areaOfRectangle;
	float marks1;
	float marks2;
	float marks3;
	float percentage;
	ConstructorDemo()
	{
		System.out.println("Constructor without Parameter");
		length=12.4f;
		breadth=12.5f;
	}
	ConstructorDemo(int marks1,int marks2,int marks3)
	{
		System.out.println("Constructor with Parameter");
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	public float areaOfRectangle() 
	{
		areaOfRectangle=length*breadth;// jar constructor cha andar define kela asta tr acess navta despite defining function insdie constructor and also method inside constructor define nahi karu sakat
		return areaOfRectangle;
	}
	public float percentage() 
	{
		percentage=marks1+marks2+marks3/(3.0f);
		return percentage;
	}
}
