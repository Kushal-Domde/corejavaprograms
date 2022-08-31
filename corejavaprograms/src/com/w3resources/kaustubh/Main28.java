//WAJP to create a new string of 4 copies of the last 3 characters of the
//original string. The length of the original string must be 3 and above. 
package com.w3resources.kaustubh;

public class Main28 
{
	public static void main(String[] args) 
	{
		String str="Kaustubh Domde Diamond ";
		if(str.length()>=3)
		{
			String result=(String) str.subSequence(str.length()-4,str.length());
			System.out.println(result+result+result+result);
		}
	}
}
