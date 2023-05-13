/*
 Program: Write a program that generates a random integer number between 1 to 10 and asks the user to guess what the number is. 
 		  If the user's guess is higher than the random number, the program should display "Too high, try again." 
 		  If the user's guess is lower than the random number, the program should display "Too low, try again." 
 		  The program should use a loop that repeats until the user correctly guesses the random number and display good guess.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a4q8
{
	public static void main(String z[])
	{
		Scanner j=new Scanner(System.in);
		while (true)
		{
			int cn=(int)(1+(10*Math.random())),un;
			System.out.print("Can you guess what number has computer choosen from 1 to 10? ");
			un=j.nextInt();
			if (cn==un)
			{
				System.out.println("Computer guess: "+cn+"\nUser guess: "+un+"\nGood guess");
				break;
			}
			else if (cn>un)
				System.out.println("Computer guess: "+cn+"\nUser guess: "+un+"\nToo low, try again");
			else
				System.out.println("Computer guess: "+cn+"\nUser guess: "+un+"\nToo high, try again");
			
		}
		j.close();
	}
}