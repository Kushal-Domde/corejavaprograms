//WAJP to Illustrates Use of Static Inner Class

package com.kaustubh.classobject;

public class StaticInnerClass 
{
	int x = 10;
    static int y = 20;
    static class Inner 			
    {
        void show()		        
        {
            System.out.println(y);
//            System.out.println(x);  error :  non-static variable x cannot be referenced from a static context
        }
    }
    public static  void main(String[] s)
    {
        System.out.println("'In main method'. The value of static data member of outer class is :"+y);
        //  System.out.println(x);                     error:  non-static variable x cannot be referenced from a static context
        System.out.println("Inner class method accessed by Inner class object value of y is ");
        Inner inner = new Inner();
        inner.show();
        System.out.println("Inner class method accessed by outer class object value of y is ");
        StaticInnerClass.Inner outer = new StaticInnerClass.Inner();
        outer.show();
    }

}
