package schoolCoding;

/*
 * Author: Bob Pham 
 * FINISHED BY: Ian Lee
 * Date: 10/12/16
 * Purpose: This program implements the classic 2-player game Tic-Tac-Toe.
 *          The rules are as follows:
 *          1. Player X goes first follow by Player O.
 *          2. Each player will have to specify their next move by selecting
 *             a number to indicate where to place their game piece.
 *          3. If player selects a location that is already occupied
 *             by a game piece, then current player will lose turn.
 */

import java.util.Scanner;

public class tictactoe {
	// ASCII artwork
	static final String xPlayer = " X  ";
	static final String oPlayer = " O  ";
	static final String emptyPlayer = "    ";
	// board position
	static final int EMPTY = 0;
	static final int X_EVEN = 2;
	static final int O_ODD = 1;
	static int position1 = EMPTY;
	static int position2 = EMPTY;
	static int position3 = EMPTY;
	static int position4 = EMPTY;
	static int position5 = EMPTY;
	static int position6 = EMPTY;
	static int position7 = EMPTY;
	static int position8 = EMPTY;
	static int position9 = EMPTY;
	// game status
	static final byte WIN = 1;
	static final byte IN_PLAY = 0;
	static final byte DRAW = -1;
	static final byte QUIT = 123;
	static byte numXOs = 0;
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {
		printGameRules();
		byte game = IN_PLAY;
		int player = X_EVEN;
		int position;
		while (game == IN_PLAY) {
			System.out.println("Player" + (player == O_ODD ? oPlayer : xPlayer) + "- select your next move:");
			numXOs++;
			position = key.nextInt();
			if (position == 123) {
				System.out.println("Quitting game...");
				System.exit(0);
			}
			switch (player) {
			case X_EVEN:
				mapNum2Board(position,player);
				player = O_ODD;
				break;
			case O_ODD:
				mapNum2Board(position,player);
				player = X_EVEN;
				break;
			}
		}
		exitGame();
	}
public static void checkWinner(int position1, int position2, int position3, int position4, int position5, int position6, int position7, int position8, int position9){
	//player 1 wins
	if (position1 == X_EVEN && position2 == X_EVEN && position3 == X_EVEN) {
		System.out.println("PLAYER 1 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position1 == X_EVEN && position4 == X_EVEN && position7 == X_EVEN) {
		System.out.println("PLAYER 1 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position1 == X_EVEN && position5 == X_EVEN && position9 == X_EVEN) {
		System.out.println("PLAYER 1 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position2 == X_EVEN && position5 == X_EVEN && position8== X_EVEN) {
		System.out.println("PLAYER 1 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position3 == X_EVEN && position5 == X_EVEN && position7 == X_EVEN) {
		System.out.println("PLAYER 1 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position3 == X_EVEN && position6 == X_EVEN && position9 == X_EVEN) {
		System.out.println("PLAYER 1 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position4 == X_EVEN && position5 == X_EVEN && position6 == X_EVEN) {
		System.out.println("PLAYER 1 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position7 == X_EVEN && position8 == X_EVEN && position9 == X_EVEN) {
		System.out.println("PLAYER 1 WINS!");
		printGameBoard();
		System.exit(0);
	}
	
	//player 2 wins
	if (position1 == O_ODD && position2 == O_ODD && position3 == O_ODD) {
		System.out.println("PLAYER 2 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position1 == O_ODD && position4 == O_ODD && position7 == O_ODD) {
		System.out.println("PLAYER 2 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position1 == O_ODD && position5 == O_ODD && position9 == O_ODD) {
		System.out.println("PLAYER 2 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position2 == O_ODD && position5 == O_ODD && position8== O_ODD) {
		System.out.println("PLAYER 2 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position3 == O_ODD && position5 == O_ODD && position7 == O_ODD) {
		System.out.println("PLAYER 2 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position3 == O_ODD && position6 == O_ODD && position9 == O_ODD) {
		System.out.println("PLAYER 2 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position4 == O_ODD && position5 == O_ODD && position6 == O_ODD) {
		System.out.println("PLAYER 2 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (position7 == O_ODD && position8 == O_ODD && position9 == O_ODD) {
		System.out.println("PLAYER 2 WINS!");
		printGameBoard();
		System.exit(0);
	}
	if (numXOs ==9) {
		System.out.println("It was a tie!");
		System.exit(0);
	}
}
	public static void mapNum2Board(int position, int player) {
		switch (position) {
		case 1:
			if (position1 == EMPTY) {
				position1 = player;
				printGameBoard();
				checkWinner(position1, position2, position3,  position4, position5,  position6,  position7, position8,  position9);
				
			}
			else{
				System.out.println("Spot taken, you lose your turn.");
			}
			break;
		case 2:
			if (position2 == EMPTY) {
				position2 = player;
				printGameBoard();
				checkWinner(position1, position2, position3,  position4, position5,  position6,  position7, position8,  position9);
			}
			else{
				System.out.println("Spot taken, you lose your turn.");
			}
			break;
		case 3:
			if (position3 == EMPTY) {
				position3 = player;
				checkWinner(position1, position2, position3,  position4, position5,  position6,  position7, position8,  position9);
				printGameBoard();
			}
			else{
				System.out.println("Spot taken, you lose your turn.");
			}
			break;
		case 4:
			if (position4 == EMPTY) {
				position4 = player;
				checkWinner(position1, position2, position3,  position4, position5,  position6,  position7, position8,  position9);
				printGameBoard();
			}
			else{
				System.out.println("Spot taken, you lose your turn.");
			}
			break;
		case 5:
			if (position5 == EMPTY) {
				position5 = player;
				checkWinner(position1, position2, position3,  position4, position5,  position6,  position7, position8,  position9);
				printGameBoard();
			}
			else{
				System.out.println("Spot taken, you lose your turn.");
			}
			break;
		case 6:
			if (position6 == EMPTY) {
				position6 = player;
				checkWinner(position1, position2, position3,  position4, position5,  position6,  position7, position8,  position9);
				printGameBoard();
			}
			else{
				System.out.println("Spot taken, you lose your turn.");
			}
			break;
		case 7:
			if (position7 == EMPTY) {
				position7 = player;
				checkWinner(position1, position2, position3,  position4, position5,  position6,  position7, position8,  position9);
				printGameBoard();
			}
			else{
				System.out.println("Spot taken, you lose your turn.");
			}
			break;
		case 8:
			if (position8 == EMPTY) {
				position8 = player;
				checkWinner(position1, position2, position3,  position4, position5,  position6,  position7, position8,  position9);
				printGameBoard();
			}
			else{
				System.out.println("Spot taken, you lose your turn.");
			}
			break;
		case 9:
			if (position9 == EMPTY) {
				position9 = player;
				checkWinner(position1, position2, position3,  position4, position5,  position6,  position7, position8,  position9);
				printGameBoard();
			}
			else{
				System.out.println("Spot taken, you lose your turn.");
			}
			break;
		}
	}

	public static void exitGame() {
		printGameBoard();
		System.out.println("Exiting Game!");
		key.close();
	}

	public static void printGameRules() {
		System.out.println("Welcome to the Java Tic-Tac-Toe Game!");
		System.out.println("\nEach player will have to specify their move by selecting");
		System.out.println("a number corresponding to any of the 9 game board locations.");

		printGameMap();
		System.out.println("\nPlayer X will go first and then Player O");
		System.out.println("If player selects a location that is already taken up by a"
				+ "\ngame piece, then player will lose turn");
		System.out.println("Quit anytime by entering 123\n");
	}

	public static void printGameMap() {
		System.out.println(" -------------------");
		System.out.println("| " + " 1  " + " | " + " 2  " + " | " + " 3  " + "|");
		System.out.println(" -------------------");
		System.out.println("| " + " 4  " + " | " + " 5  " + " | " + " 6  " + "|");
		System.out.println(" -------------------");
		System.out.println("| " + " 7  " + " | " + " 8  " + " | " + " 9  " + "|");
		System.out.println(" -------------------");
	}

	public static void printGameBoard() {
		System.out.println(" -------------------");
		System.out.println("| " + position2Str(position1) + " | " + position2Str(position2) + " | "
				+ position2Str(position3) + "|");
		System.out.println(" -------------------");
		System.out.println("| " + position2Str(position4) + " | " + position2Str(position5) + " | "
				+ position2Str(position6) + "|");
		System.out.println(" -------------------");
		System.out.println("| " + position2Str(position7) + " | " + position2Str(position8) + " | "
				+ position2Str(position9) + "|");
		System.out.println(" -------------------");
	}

	public static String position2Str(int position) {
		String result = emptyPlayer;
		switch (position) {
		case EMPTY:
			break;
		case X_EVEN:
			result = xPlayer;
			break;
		case O_ODD:
			result = oPlayer;
			break;
		default:
			System.out.println("ERR:position2Str");
		}
		return result;
	}
}
