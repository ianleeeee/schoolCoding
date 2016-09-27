package schoolCoding;

import javax.swing.JOptionPane;

public class time {
	public static void main(String[] args) {
		int minInHour = 60;
		String currentHours = JOptionPane.showInputDialog("What is the current hour?");
		String currentMinutes = JOptionPane.showInputDialog("What is the current minutes?");
		int currentHour = Integer.parseInt(currentHours);
		int currentMinute = Integer.parseInt(currentMinutes);
		String add =  JOptionPane.showInputDialog("How many minutes would you like to add to the current time?");
		int adds = Integer.parseInt(add);
		int hourMin = currentHour * minInHour;
		int totalMin = hourMin + currentMinute + adds;
		int newHour = totalMin/minInHour;
		int newMinute = totalMin%minInHour;
		if (newHour>= 13) {
			newHour = newHour%12;
		}
		else{
			newHour = newHour;
		}
		JOptionPane.showMessageDialog(null,"The new current time is "+ newHour+":"+newMinute);
	}

}
