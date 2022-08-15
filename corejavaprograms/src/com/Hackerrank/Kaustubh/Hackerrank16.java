//Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; if one  
//or more players have the same score, sort those players alphabetically by name. To do this, you must create
//a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
//method implementing the Comparator.compare(T o1, T o2) method.


package com.Hackerrank.Kaustubh;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Hackerrank16 
{
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=scanner.nextInt();    
		Player[] player=new Player[n];
		Checker checker=new Checker();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name and score of the player");
			player[i]=new Player(scanner.next(),scanner.nextInt());
		}
		scanner.close();
		Arrays.sort(player,checker);		
		System.out.println("Name and score of the player is ");
		for(int i=0;i<player.length;i++)
			System.out.printf("%s %s \n",player[i].name,player[i].score);     
	}
}
class Player
{
	String name;
	int score;
	Player(String name,int score)
	{
		this.name=name;
		this.score=score;
	}
}

class Checker implements Comparator<Player>
{
	@Override
	public int compare(Player a, Player b)
	{
		String name1=a.name;
		String name2=b.name;
		int score1=a.score;
		int score2=b.score;
		if(score1==score2)
			return name1.compareTo(name2);
		else if(score1<score2)
			return 1;
		return -1;
	}
}


