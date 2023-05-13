/*
 Program: Write a java program that takes an integer N from user, uses 
 		  Math. Random () to print N random integer numbers between 1 to N, 
 		  and then prints their average value. Use do while loop.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a4q3 
{
	public static void main(String z[])
	{
		Scanner k=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int inp=k.nextInt(),sum=0,rnd,t=inp;
		System.out.print("Random numbers generated are: ");
		do
		{
			rnd=(int)(1+(inp*Math.random()));
			System.out.print(rnd+" ");
			sum+=rnd;
		}while((t--)!=1);
		System.out.println("\nAverage of "+inp+" random numbers are "+(sum/inp));
		k.close();
	}
}
