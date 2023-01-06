// WAJP to Illustrates Use of Instance Inner Class
// Java Program to Create Outer Class Bank Account and the Inner Class Interest in it

package com.kaustubh.classobject;
class OuterClassBank
{
	int principle=5000;
	int numberOfPeriods=4;
	int rateofInterest=20;
	void test()
	{
		Inner inner=new Inner();
		inner.display();
	}
	class Inner
	{
		void display()
		{
			double simpleInterst=principle*numberOfPeriods*rateofInterest;
			System.out.println("The simple interst amount is "+simpleInterst);
		}
	}
}
