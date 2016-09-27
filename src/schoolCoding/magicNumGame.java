package schoolCoding;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

//Ian Lee
//9/16/16
//project based on chapter 2 reading

public class magicNumGame {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("host, enter the low value >>");
		int low = scan.nextInt();
		System.out.println("host, enter the high value >>");
		int high = scan.nextInt();
		int magicNum = low + (int)(Math.random()*(high - (low-1)));
		
		System.out.println("player 1, enter your name >>");
		String name1 = scan.next();
		System.out.println("player 1, enter your guess >>");
		int guess1 = scan.nextInt();
		boolean tf1 = (guess1 == magicNum);
		System.out.println("player 2, enter your name >>");
		String name2 = scan.next();
		
		System.out.println("player 2, enter your guess >>");
		int guess2 = scan.nextInt();
		boolean tf2 = (guess2 == magicNum);
		
		System.out.println("player 3, enter your name >>");
		String name3 = scan.next();
		System.out.println("player 3, enter your guess >>");
		int guess3 = scan.nextInt();
		boolean tf3 = (guess3 == magicNum);
		System.out.println("player 4, enter your name >>");
		String name4 = scan.next();
		System.out.println("player 4, enter your guess >>");
		int guess4 = scan.nextInt();
		boolean tf4 = (guess4 == magicNum);
		System.out.println("The magic number was "+magicNum);
		System.out.println(name1+ " guessed "+ guess1+ " and that was " +tf1);
		System.out.println(name2+ " guessed "+ guess2+ " and that was " +tf2);
		System.out.println(name3+ " guessed "+ guess3+ " and that was " +tf3);
		System.out.println(name4+ " guessed "+ guess4+ " and that was " +tf4);
	}

}
