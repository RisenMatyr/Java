package quartstogallonsinteractive;
import java.util.Scanner;
public class QuartsToGallonsInteractive {

	public static void main(String[] args) 
	{
		int Quarts_To_Gallon = 4;
		int quartsNeeded;
		int quartsShow;
		int gallonShow;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of quarts");
		quartsNeeded = input.nextInt();
		gallonShow = quartsNeeded / Quarts_To_Gallon;
		
		quartsShow = quartsNeeded % Quarts_To_Gallon;
		
System.out.println("Number of gallons needed = " + gallonShow + " Quarts left over " + quartsShow);

	}

}
