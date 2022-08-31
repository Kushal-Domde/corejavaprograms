//WAJP to take the last three characters from a given string and add 
//the three characters at both the front and back of the string. 

package com.w3resources.kaustubh;
public class Main37
{
	public static void main(String[] args)
	 {
	   String string1 = "Python";
	   String subpart = string1.substring(string1.length()-3);
	   System.out.println(subpart + string1 + subpart);
	 }
}
