import java.util.Scanner;

public class EvenToNumber {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number;
		int sum = 2; // Two will always be included so initialize the sum with it to reduce a loop iteration

		// Check if number is less than 2
		while (true) {
			System.out.println("Enter a number (greater or equal than two preferbably): ");
			number = scanner.nextInt();
			
			// Break out if it is greater or equal to 2
			if(number>=2)
				break;

			// Less than two will print an error message and ask to input again
			System.out.println("Your number " + "\"" + number + "\"" + " is less than two. Enter a number greater than 2!\n");
		}

		// Since we are decrementing by 2, start from an even number
		if (number % 2 != 0)
			number--;

		// Summation loop (even only). Not including 2 because sum is initialized with 2
		while(number>2) {
			sum += number;
			number -= 2;
		}	

		System.out.println("\nSum = " + sum);	
	}
}