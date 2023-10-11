import java.util.Scanner;

public class EarningsCalculator {

	//Return type is int because hourly wage is an int and question asks us to consider only int value of hours
	static int earningsPerHour(int hours){
		final int hourlyWage = 10; //Dollars
		return hourlyWage * hours;
	}

	static double doublingHourlyWage(int hours){
		double hoursWage = 0.10; //Initially only 0.10. Later doubles
		double totalEarning = 0;

		while(hours>0){
			totalEarning += hoursWage;

			//For next cycle, double the hourly wage and reduce the hours spent by 1
			hoursWage *= 2;
			hours -= 1;
		}
		return totalEarning;
	}
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		//MENU
		System.out.println("*******************************************************");
		System.out.println("\t\t\tMenu");
		System.out.println("*******************************************************");
		System.out.println("1)\t Calculate earnings at $10.00/hr");
		System.out.println("2)\t Calculate earnings at $.10 doubled each hour");
		System.out.println("3)\t Exit");
		while(true){
			System.out.println("Choose an option:");
			int choice = scanner.nextInt(); //User choice (1 for hourly wage, 2 for doubling effect and 3 to exit)
			
			//Check if valid choice
			if(choice != 1 && choice != 2 && choice != 3){
				System.out.println("Not valid option. Try Again!\n");
				continue;
			}

			//Exit condition
			if(choice==3) {
				System.out.println("Bye-Bye!");
				break;
			}

			//Valid choice so now ask for number of hours
			System.out.println("How many hours?");
			int workingHours = scanner.nextInt();

			//Calculate earnings
			double earnings = 0;
			
			if(workingHours<0){
				//Check for negative
				System.out.println("Thats a negative number. Start over and try again.\n");
				continue;
			}
			else if(workingHours==0) {
				//No hours, so no calculation needed
			}
			else if(choice==1)
				earnings = earningsPerHour(workingHours); //Calculate per hour earnings
			else
				earnings = doublingHourlyWage(workingHours); //Calculate by doubling		
				

			System.out.println("Earnings: " + earnings + "\n");
		}
		
	}
}