import java.io.Console;

public class Main 
{
	public static void main(String[] args)
	{
		String str;
		char pass[];
		Console console=System.console();
		System.out.println("Enter username");
		str=console.readLine();
		System.out.println("Enter Password");
		pass=console.readPassword();
//		if (console== null) 
//		{
//			char [] password  = console.readPassword("Enter password : ");
		System.out.println("your Password is: " +pass);
//		}
//		else
//			System.out.println("No console available");
	}
}
	


