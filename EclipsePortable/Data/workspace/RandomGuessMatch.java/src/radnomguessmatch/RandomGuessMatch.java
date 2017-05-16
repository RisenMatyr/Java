package radnomguessmatch;
import javax.swing.JOptionPane;

import java.util.Scanner;
public class RandomGuessMatch {



	public static void main(String[] args) 
	{
		 int random;
		 int MAX;
		 boolean isYes;
		
		 Scanner input = new Scanner(System.in);
		 System.out.print("Please enter a number >>");
		 MAX = input.nextInt();
 random = JOptionPane.showConfirmDialog(null, "The number is "+ (1 + (int)(Math.random() * 10)));
 		isYes = (random == JOptionPane.YES_NO_OPTION);
 		JOptionPane.showMessageDialog(null, "The number is " + isYes);
	}

}
