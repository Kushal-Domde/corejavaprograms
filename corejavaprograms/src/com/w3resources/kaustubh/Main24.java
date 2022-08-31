//WAJP to find the penultimate (next to last) word of a sentence.

package com.w3resources.kaustubh;
public class Main24 
{
	public static void main(String args[])
	{
		String string =" The quick brown fox jumps over the lazy dog.";
		String[]words=string.split(" ");
		System.out.println("Last word of the sentence is :" + words[words.length-2]);
	}
}
