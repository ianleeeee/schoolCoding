package schoolCoding;

import java.util.Random;

import javax.swing.JOptionPane;

public class rpsls {
	public static void main(String[] args) {
	String playerGuess = JOptionPane.showInputDialog("Rock, paper, scissors, lizard or spock?");
		Random aiguess = new Random();
		int guess = aiguess.nextInt(5);
		//0 is rock
		//1 is paper
		//2 is scissors
		//3 is lizard
		//4 is spock
		
		//if you guess rock
		if (playerGuess.equalsIgnoreCase("rock") && guess ==0) {
			System.out.println("It's a tie! Rock vs Rock");
		}
		if (playerGuess.equalsIgnoreCase("rock") && guess ==1) {
			System.out.println("You lose! Rock vs Paper");
		}
		if (playerGuess.equalsIgnoreCase("rock") && guess ==2) {
			System.out.println("You win! Rock vs Scissors");
		}
		if (playerGuess.equalsIgnoreCase("rock") && guess ==3) {
			System.out.println("You win! Rock vs Lizard");
		}
		if (playerGuess.equalsIgnoreCase("rock") && guess ==4) {
			System.out.println("You lose! Rock vs Spock");
		}
		
		//if you guess paper
		if (playerGuess.equalsIgnoreCase("paper") && guess ==0) {
			System.out.println("You win! Paper vs Rock");
		}
		if (playerGuess.equalsIgnoreCase("paper") && guess ==1) {
			System.out.println("It's a tie! Paper vs Paper");
		}
		if (playerGuess.equalsIgnoreCase("paper") && guess ==2) {
			System.out.println("You lose! Paper vs scissors");
		}
		if (playerGuess.equalsIgnoreCase("paper") && guess ==3) {
			System.out.println("You lose! Paper vs Lizard");
		}
		if (playerGuess.equalsIgnoreCase("paper") && guess ==4) {
			System.out.println("You win! Paper vs Spock");
		}
		
		//if you guess scissors
		if (playerGuess.equalsIgnoreCase("scissors") && guess ==0) {
			System.out.println("You lose! Scissors vs Rock");
		}
		if (playerGuess.equalsIgnoreCase("scissors") && guess ==1) {
			System.out.println("You win! Scissors vs Paper");
		}
		if (playerGuess.equalsIgnoreCase("scissors") && guess ==2) {
			System.out.println("It's a tie! Scissors vs Scissors");
		}
		if (playerGuess.equalsIgnoreCase("scissors") && guess ==3) {
			System.out.println("You win! Scissors vs Lizard");
		}
		if (playerGuess.equalsIgnoreCase("scissors") && guess ==4) {
			System.out.println("You lose! Scissors vs Spock");
		}
		
		//if you choose lizard
		if (playerGuess.equalsIgnoreCase("lizard") && guess ==0) {
			System.out.println("You lose! Lizard vs Rock");
		}
		if (playerGuess.equalsIgnoreCase("lizard") && guess ==1) {
			System.out.println("You win! Lizard vs Paper");
		}
		if (playerGuess.equalsIgnoreCase("lizard") && guess ==2) {
			System.out.println("You lose! Lizard vs Scissors");
		}
		if (playerGuess.equalsIgnoreCase("lizard") && guess ==3) {
			System.out.println("It's a tie! Lizard vs Lizard");
		}
		if (playerGuess.equalsIgnoreCase("lizard") && guess ==4) {
			System.out.println("You win! Lizard vs Spock");
		}
		
		//if you choose spock
		if (playerGuess.equalsIgnoreCase("spock") && guess ==0) {
			System.out.println("You win! Spock vs Rock");
		}
		if (playerGuess.equalsIgnoreCase("spock") && guess ==1) {
			System.out.println("You lose! Spock vs Paper");
		}
		if (playerGuess.equalsIgnoreCase("spock") && guess ==2) {
			System.out.println("You win! Spock vs Scissors");
		}
		if (playerGuess.equalsIgnoreCase("spock") && guess ==3) {
			System.out.println("You lose! Spock vs Lizard");
		}
		if (playerGuess.equalsIgnoreCase("spock") && guess ==4) {
			System.out.println("It's a tie! Spock vs Spock");
		}
		else{
			System.out.println("INVALID GUESS");
		}
		
}

}
