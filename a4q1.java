/*
 Program: Write a java program that gets three integer numbers from the user. Count from the first number to the second number
  		  increments by the third number. Use for loop to do it. Also, display the sum of numbers displayed between the first 
  		  number and second number.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a4q1 
{
	public static void main(String z[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number: ");int n1=s.nextInt();
		System.out.print("Enter second number: ");int n2=s.nextInt();
		System.out.print("Enter third number: ");int n3=s.nextInt();
		int sum=0;s.close();
		for (;n1<=n2;n1+=n3)
		{
			System.out.print(n1+" ");
			sum+=n1;
		}
		System.out.println("\nThe sum of numbers displayed is "+sum);
	}
}
