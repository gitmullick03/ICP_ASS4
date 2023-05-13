/*
 Program: Write a java program to take an integer input from the user and print the input by removing all zeros.
 Author name: SWASTIK MULLICK
 Registration no.:2241013379
 */
import java.util.*;
public class a4q9
{
	public static void main(String z[])
	{
		Scanner u=new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int s=u.nextInt(),t=s,nn=0,c=0;
		while (t!=0)
		{
			if (t%10!=0)
			{
				nn=nn+((t%10)*((int)Math.pow(10, c)));
				c++;
			}
			t/=10;
		}
		System.out.println("After removing 0 from number "+s+", the new number is "+nn);
		u.close();
	}
}