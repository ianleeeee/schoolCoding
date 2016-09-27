package schoolCoding;

import javax.swing.JOptionPane;

public class tempConverter {
	public static void main(String[] args) {
		String t = JOptionPane.showInputDialog("What farenheit temperature would you like to convert to celcius?");
		int temp = Integer.parseInt(t);
		convert(temp);
	}
	static void convert(int temp){
		double celcius =((temp-32)*(5/9.0));
		System.out.println(celcius);
		JOptionPane.showMessageDialog(null, "The new temperature in celcius is "+celcius);
	}
}
