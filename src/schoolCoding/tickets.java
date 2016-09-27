package schoolCoding;

import javax.swing.JOptionPane;

public class tickets {
	public static void main(String[] args) {
		int ticketnumber = JOptionPane.showConfirmDialog(null, "Enter a ticket number");
		//int ticketnumber = Integer.parseInt(tickNum);
		int tn = ticketnumber%10;
		int tnn = ticketnumber/10;
		int tnnn = tnn%7;
		System.out.println(tnn);
		System.out.println(tn);
		if (tnnn == tn) {
			JOptionPane.showMessageDialog(null, "the ticket is valid");
			
		}
		else{
				JOptionPane.showMessageDialog(null, "The ticket is invalid");
		}
	}

}
