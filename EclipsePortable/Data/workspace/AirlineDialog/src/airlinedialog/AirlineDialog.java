package airlinedialog;
import javax.swing.JOptionPane;
public class AirlineDialog {
//Kayla Clayton
	public static void main(String[] args) {
	int	selection; 
	selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?");
	boolean	isYes;
		isYes= (selection == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "You responded " + isYes);
		

	}

}
