package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		
		

		int numberofplays = 0;
		
		boolean playAgain = true;
		
		
		while (playAgain == true) {
			numberofplays++;
			
			System.out.println("Pick 1,2 or 3 for Rock,Paper or Scissors");
			String player = playersChoice();
			String computer = computersChoice();
			System.out.println("You have chosen " + player);
			System.out.println("The computer has chosen " + computer);
			findingWinner(player, computer);
			
			System.out.println("If you would like to play again, enter Yes. If not - enter No");
			Scanner scan = new Scanner(System.in);
			String again = scan.next();
			
			if (again.contentEquals("No")) {
				 playAgain = false;
				
			}
			
		}
		System.out.println("Game ended, you played " + numberofplays + "number of times");
		
		
		
	}

	
	public static String computersChoice() {
		Random rand = new Random();
		int computersChoice = rand.nextInt(3)+1;
		
		if (computersChoice == 1) {
			return "Rock";
			
		}
		
		else if (computersChoice == 2) {
			return "Paper";
		}
		
		else {
			return "Scissors";
		}
			
		
	}
	
	
	public static String playersChoice() {
		Scanner input = new Scanner(System.in);
		int playersChoice = input.nextInt();
		
		if (playersChoice == 1) {
			return "Rock";
		}
		
		else if (playersChoice == 2) {
			return "Paper";
		}
		
		else {
			return "Scissors";
		}
		
		
	}
	
	public static void findingWinner(String playersChoice, String computersChoice) {
		if (playersChoice == computersChoice) {
			System.out.println("Its a tie!");
		}
		
		else if ((playersChoice == "Rock"  && computersChoice == "Paper") || (playersChoice == "Scissors" && computersChoice == "Rock") || (playersChoice == "Paper" && computersChoice == "Scissors"))  {
			
			System.out.println("You loose ;( ");
		}
		
		else if ((playersChoice == "Paper" && computersChoice == "Rock") || (playersChoice == "Rock" && computersChoice == "Scissors") || (playersChoice == "Scissors" && computersChoice == "Paper")) {
			System.out.println("You win!!!!!!");
		}
		
	}

}
