//WAJP to compute the distance b/w two points on the surface of earth.
package com.w3resources.kaustubh;

import java.util.Scanner;

public class Main16 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Latitude of coordinate 1:");
		double latitude1=scanner.nextDouble();
		System.out.println("Enter the Longitude of coordinate 1:");
		double longitude1=scanner.nextDouble();
		System.out.println("Enter the Latitude of coordinate 2:");
		double latitude2=scanner.nextDouble();
		System.out.println("Enter the Longitude of coordinate 2:");
		double longitude2=scanner.nextDouble();
		System.out.println("");
		scanner.close();
		latitude1=Math.toRadians(latitude1);
		longitude1=Math.toRadians(longitude1);
		latitude2=Math.toRadians(latitude2);
		longitude1=Math.toRadians(longitude2);
		double earthRadius = 6371.01; //Kilometers
		double distance=earthRadius * Math.acos(Math.sin(latitude1)*Math.sin(latitude2) + Math.cos(latitude1)*Math.cos(latitude2)*Math.cos(longitude1 - longitude2));
		System.out.println("The distance between two points on the surface of earth is "+distance);
	}
}
