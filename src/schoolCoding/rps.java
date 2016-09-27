package schoolCoding;

import java.util.Random;

import javax.swing.JOptionPane;

public class rps {
	public static void main(String[] args) {
	String playerGuess = JOptionPane.showInputDialog("Rock, paper or scissors?");
		Random aiguess = new Random();
		int guess = aiguess.nextInt(3);
		//0 is rock
		//1 is paper
		//2 is scissors
		if (playerGuess.equalsIgnoreCase("rock") && guess ==0) {
			System.out.println("It's a tie! Rock vs Rock");
		}
		if (playerGuess.equalsIgnoreCase("rock") && guess ==1) {
			System.out.println("You lose! Rock vs Paper");
		}
		if (playerGuess.equalsIgnoreCase("rock") && guess ==2) {
			System.out.println("You win! Rock vs Scissors");
		}
		if (playerGuess.equalsIgnoreCase("paper") && guess ==0) {
			System.out.println("You win! Paper vs Rock");
		}
		if (playerGuess.equalsIgnoreCase("paper") && guess ==1) {
			System.out.println("It's a tie! Paper vs Paper");
		}
		if (playerGuess.equalsIgnoreCase("paper") && guess ==2) {
			System.out.println("You lose! Paper vs scissors");
		}
		if (playerGuess.equalsIgnoreCase("scissors") && guess ==0) {
			System.out.println("You lose! Scissors vs Rock");
		}
		if (playerGuess.equalsIgnoreCase("scissors") && guess ==1) {
			System.out.println("You win! Scissors vs Paper");
		}
		if (playerGuess.equalsIgnoreCase("scissors") && guess ==2) {
			System.out.println("It's a tie! Scissors vs Scissors");
		}
}

}
