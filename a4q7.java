/*
 Program: Write a java program to print the multiplication table of a number entered by the user.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a4q7
{
	public static void main(String z[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a no. for which you want to find the multiplication table: ");int j=s.nextInt(),k=1;
		System.out.println("\nThe multiplication table of "+j+" is:");
		while(k<=10)
		{
			System.out.println(j+" X "+k+" = "+(j*k));
			k++;
		}
		s.close();
	}
}