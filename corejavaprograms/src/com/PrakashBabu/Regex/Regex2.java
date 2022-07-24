// WAp to count the numbers of alphabets in target String
package com.PrakashBabu.course;

import java.util.regex.*;

public class Regex2 
{
	public static void main(String[] args) 
	{
		String target="abc$123xyz*789mno";
		int count=0;
		Pattern pattern=Pattern.compile("[a-z]");
		Matcher matcher=pattern.matcher(target);
		while(matcher.find())
		{
			count++;
			System.out.println(matcher.start()+ "\t"+matcher.end()+ "\t"+matcher.group());
		}
		System.out.println("The numbers of alphabets in target String is"+count);
	}
}
/*
0	1	a
1	2	b
2	3	c
7	8	x
8	9	y
9	10	z
14	15	m
15	16	n
16	17	o
*/