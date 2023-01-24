//WAJP to illustrate Use of Static keyword in case of variable

package com.kaustubh.statickey;
public class WhyStatic 
{
	String name;
	int age;
	static String hostelName;
	WhyStatic(String name,int age,String hostelName)
	{
		this.name=name;
		this.age=age;
		this.hostelName=hostelName;
	}
	void display()
	{
		System.out.println("The name of person is "+name);
		System.out.println("The age of person is "+age);
		System.out.println("The hostel name is "+hostelName);
		System.out.println("------------------------------");
		System.out.println();
	}
	public static void main(String[] args) {
		WhyStatic whyStatic=new WhyStatic("Kaustubh",28,"chopra");
		whyStatic.display();
		WhyStatic whyStatic1=new WhyStatic("Harshal",22,"chopra");
		whyStatic1.display();
		WhyStatic whyStatic2=new WhyStatic("Ravi",26,"chopra");
		whyStatic2.display();
		WhyStatic whyStatic3=new WhyStatic("Jeevan",28,"chopra");
		whyStatic3.display();
	}
}
