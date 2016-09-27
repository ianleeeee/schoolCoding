package schoolCoding;

import javax.swing.JOptionPane;

public class ChiliToGoProfit {
	public static void main(String[] args) {
		String aOrders = JOptionPane.showInputDialog("How many adult orders do you want?");
		String cOrders = JOptionPane.showInputDialog("How many child orders do you want?");
		int aOrders2 = Integer.parseInt(aOrders);
		int cOrders2 = Integer.parseInt(cOrders);
		double childProfit = .90 * cOrders2;
		double adultProfit = 2.65 * aOrders2;
		double total = childProfit + adultProfit;
		System.out.printf("The profit for every child meal is 90 cents and adults are $2.65. The grand total profit for this order is $%.2f",total);
		
	}

}
