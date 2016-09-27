package schoolCoding;

import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {
	public static void main(String[] args) {
		String numOfQuarts = JOptionPane.showInputDialog("How many quarts do you need for the job?:");
		int numOfQuarts2 = Integer.parseInt(numOfQuarts);
		JOptionPane.showMessageDialog(null,"A job that needs " + numOfQuarts2 + " quarts requires " + numOfQuarts2 / 4 +" gallons plus " + numOfQuarts2 % 4 + " quarts");
	}

}
