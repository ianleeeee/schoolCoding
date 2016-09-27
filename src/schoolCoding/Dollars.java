package schoolCoding;

import javax.swing.JOptionPane;

public class Dollars {public static void main(String[] args) {
	String dollars = JOptionPane.showInputDialog("What is your dollar amount that you want to convert?");
	int dollar = Integer.parseInt(dollars);
	int twenty = dollar/20;
	int ten = (dollar - (twenty*20))/10;
	int five = (dollar - ((twenty*20)+(ten*10)))/5;
	int one = (dollar%20)%(10)%(5);
	JOptionPane.showMessageDialog(null, "That money converts into "+twenty+" twenties, "+ten+" tens, "+five+" fives and "+one+" ones.");

}
}