package com.PrakashBabu.course;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex8 
{
	public static void main(String[] args) 
	{
		String target="abaabaaabaaaabaaaaabaaaaaa";

		Pattern pattern=Pattern.compile("a*");
		Matcher matcher=pattern.matcher(target);
		while(matcher.find())
		{
				System.out.println(matcher.start()+","+matcher.end()+"=====>"+matcher.group());
		}
	}

}
/*
0,1=====>a
1,1=====>
2,4=====>aa
4,4=====>
5,8=====>aaa
8,8=====>
9,13=====>aaaa
13,13=====>
14,19=====>aaaaa
19,19=====>
20,26=====>aaaaaa
26,26=====> 
 */ 
 


	

