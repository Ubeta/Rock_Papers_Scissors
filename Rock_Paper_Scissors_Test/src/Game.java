
import java.util.*;

public class Game {

	public static void main(String[] args) {

		// 0 == rock, 1 == paper, 2 == scissors

		//declared variables
		int userChoice, computerChoice;
		//initializing 'scanner' class
		Scanner sc = new Scanner(System.in);
		//declaring and intializing random number generator
		Random rand = new Random();
		computerChoice = rand.nextInt(2);
		//Game introduction
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("Rock = 0");
		System.out.println("Paper = 1");
		System.out.println("Scissors = 2");
		System.out.print("Please enter your choice: ");
		//User choice input
		userChoice = sc.nextInt();

		//Checks to see if user input choice is valid
		if (userChoice < 0 || userChoice > 2) {
			System.out.print("Invalid choice, please try again: ");
			userChoice = sc.nextInt();
		}
		//User chose rock and random computer choice logic
		if (userChoice == 0) {
			if (computerChoice == 0) {
				System.out.println("Both players chose Rock!");
			} else if (computerChoice == 1) {
				System.out.println("Player chose Rock; Computer chose Paper.");
				System.out.println("Computer Wins. :<");
			} else if (computerChoice == 2) {
				System.out.println("Player choice Rock; Computer choice Scissors.");
				System.out.println("Player Wins! ^.^");
			} 
			//Debug
			else {
				System.out.println("Oops! There's an error in userChoice == 0!");
			}
		}
		//User chose Paper and random computer choice logic
		if (userChoice == 1) {
			if (computerChoice == 0) {
				System.out.println("Player chose Paper; Computer chose Rock.");
				System.out.println("Player Wins! ^.^");
			} else if (computerChoice == 1) {
				System.out.println("Both players chose Paper!");
			} else if (computerChoice == 2) {
				System.out.println("Player chose Paper; Computer chose Scissors!");
				System.out.println("Computer Wins. :<");
			} 
			//Debug
			else {
				System.out.println("Oops! There's an error in userChoice == 1");
			}
		}
		if (userChoice == 2) {
			if (computerChoice == 0) {
				System.out.println("Player chose Scissors; Computer chose Rock!");
				System.out.println("Computer wins. :<");
			} else if (computerChoice == 1) {
				System.out.println("Player chose Scissors; Computer chose Paper!");
				System.out.println("Player Wins! ^.^");
			} else if (computerChoice == 2) {
				System.out.println("Both players chose Scissors!");
			}
			//Debug
			else {
				System.out.println("Oops! There's an error in userChoice == 2");
			}
		}

	}

}
