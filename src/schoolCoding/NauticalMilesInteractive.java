package schoolCoding;

import javax.swing.JOptionPane;

public class NauticalMilesInteractive {
	public static void main(String[] args) {
		String nauticalMiles = JOptionPane.showInputDialog("Enter a number of nautical miles to convert:");
		int nauticalMiles2 = Integer.parseInt(nauticalMiles);
		JOptionPane.showMessageDialog(null, nauticalMiles2 + " nautical miles is equal to " + nauticalMiles2 * 1.852 + " kilometers and " + nauticalMiles2 * 1.150779+ " miles.");
	}

}
