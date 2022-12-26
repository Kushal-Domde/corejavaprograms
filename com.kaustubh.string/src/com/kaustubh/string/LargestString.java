package com.kaustubh.string;

public class LargestString 
{
	
	public static void maximumminimum(String string)
	{
		String[] words=string.split(" ");
		String smallestWord=" ";
		String largestWord=" ";
		int minimumLength=Integer.MAX_VALUE;
		int maximumLength=Integer.MIN_VALUE;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>maximumLength)
			{
				maximumLength=words[i].length();
				largestWord=words[i];
			}
			if(words[i].length()<minimumLength)
			{
				minimumLength=words[i].length();
				smallestWord=words[i];
			}	
		}
		System.out.println("Largest word is "+largestWord+" and smallest word is "+smallestWord);
		
	}
	public static void main(String[] args) 
	{
				LargestString.maximumminimum("I Belong to India");
	}
}
