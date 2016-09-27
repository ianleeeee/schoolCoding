package schoolCoding;

import javax.swing.JOptionPane;

public class idk {
	public static void main(String[] args) {
		String xx = JOptionPane.showInputDialog("Enter a number:");
		String yy = JOptionPane.showInputDialog("Enter another number(smaller than the one you just entered):");
		int x = Integer.parseInt(xx);
		int y = Integer.parseInt(yy);
		JOptionPane.showMessageDialog(null, isDivisible(x,y));
		
	}
public static boolean isDivisible(int x, int y){
	boolean div = false;
	if (x%y ==0) {
		return true;
	}
	else{
		return false;
	}
}

}
