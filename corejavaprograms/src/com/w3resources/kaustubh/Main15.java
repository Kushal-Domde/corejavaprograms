// Write a Java program to compute the area of a hexagon.
package com.w3resources.kaustubh;

import java.util.Scanner;

public class Main15 
{
	 public static void main(String[] args) 
	 {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input the length of a side of the hexagon: ");
	        double side = scanner.nextDouble();
	        scanner.close();
	        double area=6*(side*side)/(4*Math.tan(Math.PI/6));
	        System.out.print("The area of the hexagon is: " +area);
	 }
}
