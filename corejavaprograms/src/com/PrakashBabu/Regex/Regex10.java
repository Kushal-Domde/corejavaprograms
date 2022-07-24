package com.PrakashBabu.course;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex10
{
		public static void main(String[] args) 
		{
			String target="abaabaaabaaaabaaaaabaaaaaa";
//			Pattern pattern=Pattern.compile("a{3}");
			Pattern pattern=Pattern.compile("a{3,5}");
			Matcher matcher=pattern.matcher(target);
			while(matcher.find())
			{
					System.out.println(matcher.start()+","+matcher.end()+"=====>"+matcher.group());
			}
		}
}
/*
5,8=====>aaa
9,12=====>aaa
14,17=====>aaa
20,23=====>aaa
23,26=====>aaa
 
5,8=====>aaa
9,13=====>aaaa
14,19=====>aaaaa
20,25=====>aaaaa

 */ 

