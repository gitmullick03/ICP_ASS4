/*
 Program: Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's algorithm, 
 		  which is an iterative computation based on the following observation: if y divides x, the GCD of 
 		  x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a4q4 
{
	public static void main(String z[])
	{
		Scanner k=new Scanner(System.in);
		System.out.print("Enter the first number: ");int n1=k.nextInt();
		System.out.print("Enter the second number: ");int n2=k.nextInt();
		System.out.print("GCD of "+n1+" and "+n2+" is ");
		while(n1!=n2)
		{
			if (n1>n2)
				n1-=n2;
			else
				n2-=n1;
		}
		System.out.println(n1);
		k.close();
	}
}
