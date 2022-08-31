// WAJP to capitalize the first letter of each word in a sentence. 
package com.w3resources.kaustubh;

public class Main23 
{
		public static void main(String[] args) {
		String first=" hello kaustubh diamond";
//		first=" "+first;
		String last="";
		for(int i=0;i<first.length();i++)
		{
			char ch=first.charAt(i);
			if(ch==' ')
			{
				last=last+ch;
				i++;
				ch=first.charAt(i);
				last=last+Character.toUpperCase(ch);
			}
			else
				last=last+ch;
		}
		last=last.trim();
		System.out.println(last);		
	}
}
