package schoolCoding;

import java.util.Random;
import javax.swing.JOptionPane;

//Ian Lee
//10/4/16
//Rock paper scissors lizard spock
public class rpsls2 {

	static String numberToName(int n) {
		switch (n) {
		case 0:
			return "rock";
		case 1:
			return "Spock";
		case 2:
			return "paper";
		case 3:
			return "lizard";
		case 4:
			return "scissors";
		default:
			return "Not defined";
		}
	}

	static int nameToNum(String name) {
		switch (name) {
		case "rock":
			return 0;
		case "Spock":
			return 1;
		case "paper":
			return 2;
		case "lizard":
			return 3;
		case "scissors":
			return 4;
		default:
			return 5;
		}
	}

	static void whoWins(String playerGuess) {
		Boolean win = true;
		Random rand = new Random();
		int playerNumber = nameToNum(playerGuess);
		int compNumber = rand.nextInt(5);
		String compName = numberToName(compNumber);
		System.out.println("Player chooses " + playerGuess);
		System.out.println("Computer chooses " + compName);
		if (compNumber - playerNumber == 0) {
			System.out.println("Player and computer tie!\n");
			win = false;
			System.exit(0);
		}
		if (compNumber - playerNumber <= -1) {
			System.out.println("Player wins!");
			System.exit(0);
			win = false;
		}

		if ((compNumber - playerNumber) % 5 < 3) {
			if (win = true) {
				System.out.println("Computer wins!");
			} else {

			}

		} else {
			System.out.println("Player wins!\n");
			System.exit(0);
			win = false;
		}
	}

	public static void main(String[] args) {
		String guess = JOptionPane.showInputDialog("Enter your guess (rock, paper, scissors, lizard or spock)");
		if (guess.equalsIgnoreCase("rock")) {
			whoWins("rock");
		}
		if (guess.equalsIgnoreCase("paper")) {
			whoWins("paper");
		}
		if (guess.equalsIgnoreCase("scissors")) {
			whoWins("scissors");
		}
		if (guess.equalsIgnoreCase("lizard")) {
			whoWins("lizard");
		}
		if (guess.equalsIgnoreCase("spock")) {
			whoWins("spock");
		}
	}
}
