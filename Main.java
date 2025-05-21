/**
 * AUTHOR:      Conal Hamilton
 * CLASS:       CS111 - Intro to CS I: Java
 * TOPIC:       Console Input With Validation
 * Date Last Modified: 20 May 2025
 */

import java.util.Scanner;

 public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		NetflixOriginal[] userShows = new NetflixOriginal[2];
		for (int i = 0; i < userShows.length; i++)
		{
			userShows[i] = Main.instantiateFromInput(keyboard);
			System.out.println(userShows[i]);
		}
		keyboard.close();
	}

	public static NetflixOriginal instantiateFromInput(Scanner keyboard)
	{
		String name, genre;
		double starRating;
		NetflixOriginal result = new NetflixOriginal();
		//Series Name prompt, no validation
		System.out.print("Please enter the name of the show: ");
		name = keyboard.nextLine();
		result.setName(name);
		//Star Rating prompt and validation
		do
		{
			System.out.print("Please enter the star rating: ");
			starRating = keyboard.nextDouble();
			keyboard.nextLine();
			result.setStarRating(starRating);
			//if(result.setStarRating(starRating) == false)
			//{
			//	System.out.println("Invalid star rating, please enter a value between 0 and 5 with up to one decimal place.");
			//}
		}
		while(result.setStarRating(starRating) == false);
		//Genre prompt and validation
		do
		{
			System.out.print("Please enter the genre: ");
			genre = keyboard.nextLine();
			result.setGenre(genre);
			//if(result.setGenre(genre) == false)
			//{
			//	System.out.println("Invalid genre, please enter a genre from among these: drama, comedy, horror, action, science fiction, anime, reality, unknown.");
			//}
		}
		while(result.setGenre(genre) == false);
		return result;
	}
}
