package schoolCoding;

import javax.swing.JOptionPane;

//Ian Lee
//9/18/16
//Minute Calculator
public class MinuteConversion {
	public static void main(String[] args) {
		//asking for user input
		String minute = JOptionPane.showInputDialog("How many minutres do you want to covert?");
		int minutes = Integer.parseInt(minute);
		final int minInDays = 1440;
		final int minInHours = 60;
		//calculating days
		int days = minutes/minInDays;
		//calculating hours
		int hours = (minutes-(days*minInDays))/minInHours;
		//displaying output
		JOptionPane.showMessageDialog(null, minutes+" minutes is equal to "+days+" days, "+hours+" hours and "+(minutes%minInDays)%(minInHours)+" minutes");
		
	}

}
