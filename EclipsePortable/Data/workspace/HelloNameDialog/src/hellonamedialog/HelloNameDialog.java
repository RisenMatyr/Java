package hellonamedialog;
import javax.swing.JOptionPane;
public class HelloNameDialog {
//Kayla Clayton
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Hello, " + result + "!");

	}

}