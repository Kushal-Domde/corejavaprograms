/*
Write a Person class with an instance variable,age,and a constructor that takes an integer,
initial Age, as a parameter.The constructor must initial Age assign to age after confirming the 
argument passed as initial Age is not negative; if a negative argument is passed as initial Age,
the constructor should set to 0 and print Age is not valid, setting age to 0.. In addition, you 
must write the following instance methods:
yearPasses() should increase the  instance variable by 1.
amIOld() should perform the following conditional actions:
If age<13 print You are young..
If age>13 and age<18, print You are a teenager..
Otherwise, print You are old..
 
 
 */

package com.Hackerrank.Kaustubh;

import java.util.Scanner;

public class Hackerrank2 
{
    static class Person 
    {
        private int age;
        public Person(int initialAge)
        {
            if (initialAge > 0) 
                age = initialAge;
            else 
            {
                System.out.println("Age is not valid, setting age to 0.");
                age = 0;
            }    
        }
        public void amIOld() 
        {
             if (age < 13) 
                System.out.println("You are young.");
            else if (age< 18) 
                System.out.println("You are a teenager.");
            else 
                System.out.println("You are old.");
        }
        public void yearPasses() 
        {
                    age++;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) 
        {
        	System.out.println("Enter the age: ");
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) 
            {
                p.yearPasses();
            }
            System.out.println();
        }
        sc.close();
    }
}


