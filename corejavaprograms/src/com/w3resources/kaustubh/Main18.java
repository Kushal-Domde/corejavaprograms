//WAJP to create & display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there. 
package com.w3resources.kaustubh;

public class Main18 
{
	public static void main(String[] args) 
	{
		int i;
		int amount=0;
		int j;
		int k;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				for(k=1;k<=4;k++)
				{
					if(k!=i && k!=j && i!=j)
					{
							amount++;
							System.out.println(i+""+j+""+k+"");
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + amount);
	}
}
