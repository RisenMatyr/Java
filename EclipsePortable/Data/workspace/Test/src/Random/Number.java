package Random;
import java.util.Random;
public class Number {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.println(getRandomNumberInRange(1, 6) + getRandomNumberInRange1(1, 6));
		}
	}
	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	private static int getRandomNumberInRange1(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	

}