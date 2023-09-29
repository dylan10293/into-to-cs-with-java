import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Constant value for PI
		final double piValue = 3.1425;

		//Input radius of circle here (cm)
		// double radiusOfCircle = 12.5;
		double radiusOfCircle;

		System.out.println("Enter the radius (cm): ");
		radiusOfCircle = scan.nextDouble();

		double calculatedArea = piValue * radiusOfCircle * radiusOfCircle;
		System.out.println("The area of your circle is: " + calculatedArea + " cm^2");
	}
}