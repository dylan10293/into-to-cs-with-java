public class GetMyChange {
	public static void main(String[] args){

		// Constant values of denominations converted to cents
		final int quarterInCents = 25;	
		final int dimeInCents = 10;	
		final int nickelInCents = 5;

		// Change purchase value here
		int purchase = 100;
		int change = 100 - purchase;
		
		// Initial value is just for the end print statement
		int initialChangeValue = change;
		
		int quartersReturned = change/quarterInCents;
		change = change % quarterInCents;
		
		int dimesReturned = change/dimeInCents;
		change = change % dimeInCents;
		
		int nickelsReturned = change/nickelInCents;
		change = change % nickelInCents;
		
		System.out.println("Your change of " + initialChangeValue + " cents is given as:");
		System.out.println(quartersReturned + " Quarters");
		System.out.println(dimesReturned + " Dimes");
		System.out.println(nickelsReturned + " Nickels");
		System.out.println(change + " Pennies");
	}
}