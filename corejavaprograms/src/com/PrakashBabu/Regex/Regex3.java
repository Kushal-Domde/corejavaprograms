//WAP to demonstrate predefined character classes
package com.PrakashBabu.course;

import java.util.regex.*;

public class Regex3 
{
	public static void main(String[] args) 
	{
//		String target="abc $ 123 xyz * 789 mno";
//		int count=0;
//		Pattern pattern=Pattern.compile("\\s");
//		Matcher matcher=pattern.matcher(target);
//		while(matcher.find())
//		{
//			count++;
//			System.out.println(matcher.start()+"\t"+matcher.end()+"\t"+matcher.group());
//		}
//		System.out.println("No of spaces is :"+count);
	

/*
3	4	 
5	6	 
9	10	 
13	14	 
15	16	 
19	20	 

*/

		String target="abc $ 123 xyz * 789 mno";
		int count=0;
		Pattern pattern=Pattern.compile("\\S");
		Matcher matcher=pattern.matcher(target);
		while(matcher.find())
		{
			count++;
			System.out.println("Except spaces characters are "+matcher.start()+"\t"+matcher.end()+"\t"+matcher.group());
		}
		System.out.println("count of characters is :"+count);
	}
}
/*
Except spaces characters are 0	1	a
Except spaces characters are 1	2	b
Except spaces characters are 2	3	c
Except spaces characters are 4	5	$
Except spaces characters are 6	7	1
Except spaces characters are 7	8	2
Except spaces characters are 8	9	3
Except spaces characters are 10	11	x
Except spaces characters are 11	12	y
Except spaces characters are 12	13	z
Except spaces characters are 14	15	*
Except spaces characters are 16	17	7
Except spaces characters are 17	18	8
Except spaces characters are 18	19	9
Except spaces characters are 20	21	m
Except spaces characters are 21	22	n
Except spaces characters are 22	23	o
count of characters is :17
*/







