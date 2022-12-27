// WAJP to reverse each word in a string

package com.kaustubh.string; 
public class ReverseWord
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
}
    
    



