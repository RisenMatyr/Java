package nauticalmilesinteractive;
import java.util.Scanner;
public class NauticalMilesInteractive {

	public static void main(String[] args)
	{
		double Kilometer_To_Mile = 1.150779;
		double kilometerNeeded;
		double kilometerShow;
		double milesShow; 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Kilometers");
		kilometerNeeded = input.nextDouble();
		milesShow = kilometerNeeded / Kilometer_To_Mile;
		
		kilometerShow = kilometerNeeded % Kilometer_To_Mile;
		
System.out.println("Number of kilometers needed = " + milesShow + " miles left over " + kilometerShow);

	}

}
