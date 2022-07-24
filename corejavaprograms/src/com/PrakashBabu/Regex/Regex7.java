package com.PrakashBabu.course;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex7
{
		public static void main(String[] args) 
		{
			String target="abaabaaabaaaabaaaaabaaaaaa";

			Pattern pattern=Pattern.compile("a+");
			Matcher matcher=pattern.matcher(target);
			while(matcher.find())
			{
					System.out.println(matcher.start()+","+matcher.end()+"=====>"+matcher.group());
			}
		}
}
/*
0,1=====>a
2,4=====>aa
5,8=====>aaa
9,13=====>aaaa
14,19=====>aaaaa
20,26=====>aaaaaa
 
 */ 
 

