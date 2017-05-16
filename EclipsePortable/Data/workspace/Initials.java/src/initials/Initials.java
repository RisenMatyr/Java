package initials;
import java.util.Scanner;
public class Initials
{

	public static void main(String[] args)
	{
		String firstinitial;
		String secondinitial;
		String thirdinitial;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first initial >>");
		firstinitial = input.nextLine();
		
		
		System.out.println("Enter your second initial >>");
		secondinitial = input.nextLine();
		
		
		System.out.println("Enter your third initial >>");
		thirdinitial = input.nextLine();
		
		System.out.print(firstinitial + "." + secondinitial + "." + thirdinitial + ".");
	}

}
