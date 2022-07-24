// WAp to display digits present in string

package com.PrakashBabu.course;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {

	public static void main(String[] args) 
	{
		String target="abc $ 123 xyz * 789 mno";
		int count=0;
		Pattern pattern=Pattern.compile("\\d");
		Matcher matcher=pattern.matcher(target);
		while(matcher.find())
		{
				count++;
				System.out.println("Digits present in target is: "+matcher.start()+"\t"+matcher.end()+"\t"+matcher.group());
		}
		System.out.println("count of digits present in target is: "+count);
	}

}
