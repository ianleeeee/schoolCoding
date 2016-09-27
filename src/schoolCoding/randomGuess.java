package schoolCoding;

import java.util.Random;

import javax.swing.JOptionPane;

public class randomGuess {
	public static void main(String[] args) {
		Random x = new Random();
		int a = x.nextInt(10) +1;
		String number = JOptionPane.showInputDialog(null, "Think of a number between 1 and 10:");
		int num = Integer.parseInt(number);
		if (num == a) {
			JOptionPane.showMessageDialog(null, "The number was " + a + ", you were right!");
		} else {
			JOptionPane.showMessageDialog(null, "You were wrong, the number was " + a + " and you guessed "+ num);
		}

	}

}
