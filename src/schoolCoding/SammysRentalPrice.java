package schoolCoding;

import javax.swing.JOptionPane;

public class SammysRentalPrice {
	public static void main(String[] args) {
		
	
		String renttime = JOptionPane.showInputDialog("How long did you rent a piece of equipment for?(in minutes)");
		int time = Integer.parseInt(renttime);
		int hours = time/60;
		int mins = time % 60;
		int hourCash = hours * 40;
		JOptionPane.showMessageDialog(null, "You renter a piece of rquipment for "+ hours+ " hours and "+ mins+ " minutes. \n That is a total cost of $"+ (hourCash + mins));
	}

}
