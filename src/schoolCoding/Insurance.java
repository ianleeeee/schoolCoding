package schoolCoding;

import javax.swing.JOptionPane;

public class Insurance {
	public static void main(String[] args) {
		String old = JOptionPane.showInputDialog("Enter your age that you will turn or have turned this year");
		int age = Integer.parseInt(old);
		JOptionPane.showMessageDialog(null, "Since you are "+age+" years old, you will pay $"+calcpay(age));
	}
	static int calcpay(int age){
		int decades = age/10;
		int pay = (decades + 15)*20;
		return pay;
	}
}
