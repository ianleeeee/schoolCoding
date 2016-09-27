package schoolCoding;

import javax.swing.JOptionPane;

public class PaintCalculator {public static void main(String[] args) {
	String length = JOptionPane.showInputDialog("Enter the length in feet");
	String width = JOptionPane.showInputDialog("Enter the width in feet");
	String height = JOptionPane.showInputDialog("Enter the height in feet");
	int length1 = Integer.parseInt(length);
	int width1 = Integer.parseInt(width);
	int height1 = Integer.parseInt(height);
	int surface = calculateWallArea(height1,width1,length1);
	if (calculateGal(surface) ==0) {
		JOptionPane.showMessageDialog(null,"This job needs "+ 1+" gallons and will cost $"+32);
	}
	else
	JOptionPane.showMessageDialog(null,"This job needs "+ calculateGal(surface)+" gallons and will cost $"+ calculateGal(surface)*32);
}
static int calculateWallArea(int height, int width, int length){
	int totalArea = (2*width*height) + (2*length*height);
	return totalArea;
}
static int calculateGal(int surface){
	if (surface%350 == 0) {
		int gallonsNeeded = surface/350;
		return gallonsNeeded;
	}
	else{
		int gallonsNeeded = (surface/350);
		return gallonsNeeded;
	}
}
}
