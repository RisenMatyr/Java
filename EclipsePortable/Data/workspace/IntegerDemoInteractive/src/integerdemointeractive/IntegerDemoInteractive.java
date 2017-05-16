package integerdemointeractive;
import java.util.Scanner; 
public class IntegerDemoInteractive {

	private static int anInt;
	private static byte aByte;
	private static short aShort;
	private static long aLong;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer >>");
			anInt = input.nextInt();
		System.out.print("Please enter a byte integer >>");
			aByte = input.nextByte();
		System.out.print("Please enter a short integer >>");
			aShort = input.nextShort();
		System.out.print("Please enter a long integer >>");
			aLong = input.nextLong();
		String name; 
		System.out.print("Please enter your name >>");
		name = input.nextLine();
		System.out.println("Thank you, " + name);
		name = input.nextLine();

	}

}
