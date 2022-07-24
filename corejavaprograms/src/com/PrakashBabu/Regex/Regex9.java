package com.PrakashBabu.course;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex9
{
		public static void main(String[] args) 
		{
			String target="abaabaaabaaaabaaaaabaaaaaa";

			Pattern pattern=Pattern.compile("a?");
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
2,3=====>a
3,4=====>a
4,4=====>
5,6=====>a
6,7=====>a
7,8=====>a
8,8=====>
9,10=====>a
10,11=====>a
11,12=====>a
12,13=====>a
13,13=====>
14,15=====>a
15,16=====>a
16,17=====>a
17,18=====>a
18,19=====>a
19,19=====>
20,21=====>a
21,22=====>a
22,23=====>a
23,24=====>a
24,25=====>a
25,26=====>a
26,26=====>
 
 */ 



