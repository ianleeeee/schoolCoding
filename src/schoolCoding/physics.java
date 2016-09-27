package schoolCoding;

import javax.swing.JOptionPane;

public class physics {
	public static void main(String[] args) {
		String distance1 = JOptionPane.showInputDialog(null,"Enter a height value");
		int distance = Integer.parseInt(distance1);
		double grav = 9.8;
		
		JOptionPane.showMessageDialog(null, "The time it will take to fall "+distance+ " meters is "+ calculate(distance , grav)+ " seconds");
		
	}
	static double calculate(int distance, double grav){
		double time = Math.sqrt(2*distance / grav);
		return time;
		
	}
}

