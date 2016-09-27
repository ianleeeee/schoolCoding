package schoolCoding;

import javax.swing.JOptionPane;

public class Eggs {
	public static void main(String[] args) {
		String eggs = JOptionPane.showInputDialog("How many eggs do you want to order?:");
		int eggs2 = Integer.parseInt(eggs);
		double total = ((eggs2 / 12)* 3.25) + ((eggs2 % 12)*.45);
		System.out.printf("With an order of " + eggs2 + " eggs, that is " + eggs2 / 12 + " dozens at $3.25 per dozen and " + eggs2 % 12 + " loose eggs at 45 cents each, giving you a grand total of $%.2f" ,total);
	}

}
