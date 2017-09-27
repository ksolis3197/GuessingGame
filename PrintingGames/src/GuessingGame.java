import java.lang.Math;


import java.util.Scanner;
import java.util.InputMismatchException;
/*
 * Katherin Solis
 * Last Update 9/26/17
 * Periods 6/7
 */


/*Katherin has atempted to make a change pull 
 * and even made a new branch because 
 * she doesnt understand merging
*/

//Katherin also forgot to add an apostrophe in "doesn't"


//katherin this is GREAT

//Dana has viewed this twice now.
public class GuessingGame {
	public static void main (String[]args)
	{
		/*	Scanner input = new Scanner(System.in);
			System.out.println("What is your name?");
			String S = input.next();
			System.out.println("Nice to meet you " + S);
		
			System.out.println("How old are you?");
			int x = input.nextInt();
				if (x>10)
				{
					System.out.println(x + " Means your'e not a kid anymore");
					
				}
				else
				{
					System.out.println("Your'e still a kid, enjoy");
				}
		*/
		
		Scanner input = new Scanner(System.in);
		
		//this will print out the prompt to begin the game
		System.out.println("My number is between 1 and 10");
		System.out.println("Guess my number");
		int num = (int)(Math.random()*10 +1);
		System.out.println(num);
		int guessNum = input.nextInt();
			if (num==guessNum)
			{
				System.out.println("Correct "+guessNum+" is My Number");
			}
		if(guessNum != num)
		{
			System.out.println("Try Again");
			input.nextInt();
		}
	}
}

//Comments have been added in order to descibe the process of merging 
//We first create a repository and then we create a branch
//Next we make go to our files and attempt to merge both places
