// WAJP to reverse each word in a string

package com.kaustubh.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class ProgramString{	
    // Function to reverse the string
    static String reverseString(String str) {
        String[] words = str.split(" ");
        String reverse =" ";
        int i;
        for (i = 0; i < words.length; i++) 
        {
            StringBuffer sb = new StringBuffer(words[i]);
            reverse+=sb.reverse().toString();
            reverse+=" ";
        }
        return reverse;
    }
    
    
    // Function to read the input and display the output
    public static void main(String[] args) 
    {
        String reverse=ProgramString.reverseString("Tushar deshmukh");
        System.out.println();
//      System.out.println("The reverse of the string word by word in place is\n");
//      System.out.println();
    }
}


