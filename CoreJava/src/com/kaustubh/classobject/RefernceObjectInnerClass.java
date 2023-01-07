// WAJP to Illustrates Use of Referencing the Object from Inner Class.

package com.kaustubh.classobject;
public class RefernceObjectInnerClass
{
    static RefernceObjectInnerClass.InnerClass innerClass;
    void display()
    {
        System.out.println("Illustrating Use of Referencing the Object from Inner Class");
    }
    static public class InnerClass
    {
    	public void test()
        {
    		RefernceObjectInnerClass refernceObjectInnerClass = new RefernceObjectInnerClass();
    		refernceObjectInnerClass .display();
        }
    }
}    