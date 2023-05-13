/*
 Program: Write a Java program to check if a number is perfect number or not.
		  (Hints: A number N is called perfect number, if the sum of factors 
		  except N as a factor is equals to the number N.)
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
*/
import java.util.*;
public class a4q5
{
	public static void main(String z[])
	{
		Scanner j=new Scanner(System.in);
		System.out.print("Enter a number: ");int t=j.nextInt(),k=1,sum=0;
		while(k!=t)
		{
			if(t%k==0)
				sum+=k;
			k++;
		}
		if(sum==t)
			System.out.println(t+" is a perfect number.");
		else
			System.out.println(t+" is not a perfect number.");
		j.close();
	}
}