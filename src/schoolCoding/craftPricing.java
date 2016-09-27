package schoolCoding;

import javax.swing.JOptionPane;

public class craftPricing {
	public static void main(String[] args) {
		String item = JOptionPane.showInputDialog("Enter an item");
		String costMat = JOptionPane.showInputDialog("What is the cost of the materials that were used on the " + item);
		String hours = JOptionPane.showInputDialog("Enter the number of hours worked");
		int costMaterials = Integer.parseInt(costMat);
		int hour = Integer.parseInt(hours);
		JOptionPane.showMessageDialog(null,
				"The " + item + " should be sold for $" + calculateCost(costMaterials, hour));
	}

	static int calculateCost(int costMaterials, int hour) {
		int cost = ((costMaterials + 12) * hour) + 7;
		return cost;
	}
}
