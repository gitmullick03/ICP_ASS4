/*
 Program: An integer n is divisible by 9 if the sum of its digits is divisible by 9. 
 		  Use this concept in your program to determine whether or not the number is divisible by 9. 
 		  Test it on the following numbers: Use while loop.
 		  n = 123456
 		  n = 154368
 		  n = 621594
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a4q2 
{
	public static void main(String z[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n=s.nextInt(),t=n,sum=0;
		while (t!=0)
		{
			sum=sum+(t%10);t/=10;
		}
		if (sum%9==0)
			System.out.println("The number "+n+" is divisible by 9.");
		else
			System.out.println("The number "+n+" is not divisible by 9.");
		s.close();
	}
}
