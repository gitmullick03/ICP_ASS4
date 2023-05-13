/*
 Program: Write a java program to print largest power of three less than or equal to N.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a4q10
{
	public static void main(String z[])
	{
		Scanner r=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N=r.nextInt(),n=3,c=0;
		while (true)
		{
			if ((int)Math.pow(n, c)>N)
				break;
			c++;
		}
		System.out.println("The largest power of 3 less than or equal to "+N+" is "+(int)Math.pow(n, c-1)+", i.e. 3 raised to the power "+(c-1));
		r.close();
	}
}