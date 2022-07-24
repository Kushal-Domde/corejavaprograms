// WAp to count the numbers of a's in target String

import java.util.regex.*;
public class Regex1 
{
	public static void main(String[] args) 
	{
		String target="ababababc";
		int count=0;
		Pattern pattern=Pattern.compile("a");
		Matcher matcher= pattern.matcher(target);
		while(matcher.find())
		{
			count++;
		}
		System.out.println("The numbers of a's in target String is "+count);
	}

}
