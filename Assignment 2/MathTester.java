import java.util.Scanner;
import java.util.Random;

public class MathTester {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		// Positive random single digit number needed, so we need to avoid 0 and 10
		int number1 = random.nextInt(9) + 1;
		int number2 = random.nextInt(9) + 1;

		// Math time!
		while(true){
			System.out.println("\nHow much is " + number1 + " times " + number2 + " ?");
			System.out.println("(Enter \"-1\" to stop at anytime)");

			int answer = scanner.nextInt();

			// Keep going till you hit -1
			if(answer == -1)
				break;
			else if(answer != (number1 * number2))
				System.out.println("No.  Please try again.");
			else {
				System.out.println("Very Good!");
				// Generate new batch of random numbers
				number1 = random.nextInt(9) + 1;
				number2 = random.nextInt(9) + 1;
			}
		}


	}
}