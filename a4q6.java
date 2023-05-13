/*
 Program: Write a java program to enter two numbers through the keyboard. 
 		  Write a program to find the value of one number raised to the power of another. 
 		  (Do not use Java built-in method).
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a4q6
{
	public static void main(String z[])
	{
		Scanner i=new Scanner(System.in);
		System.out.print("Enter the base: ");int b=i.nextInt();
		System.out.print("Enter the power: ");int p=i.nextInt(),expo=1;
		System.out.print(b+" to the power "+p+" is: ");
		while(p!=0)
		{
			expo*=b;
			p--;
		}
		System.out.println(expo);
		i.close();
	}
}