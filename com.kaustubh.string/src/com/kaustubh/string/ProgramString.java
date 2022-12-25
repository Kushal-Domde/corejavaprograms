// WAJP to reverse each word in a string

package com.kaustubh.string; 
public class ProgramString
{		
	    static String reverseString(String str) 
	    {
	        String[] words = str.split(" ");
	        String reverse =" ";
	        int i;
	        for (i = 0; i < words.length; i++) 
	        {
	            StringBuffer sb = new StringBuffer(words[i]);
	            reverse+=sb.reverse().toString();
	            // reverse+=" "; rahsuThkumhsed
	            reverse+=" ";
	        }
	        return reverse;
	    }
	    public static void main(String[] args) 
	    {
	        String reverse=ProgramString.reverseString("Diamond Kaustubh Domde");
	        System.out.println(reverse);
	    }
}
    
    



