package hungry;

import java.util.Scanner;

public class eatingTime {

	public static void main(String[] args) {

		
		System.out.println("Thank you for letting me help you decide what to eat!");
		System.out.println("Answer two simple questions and I will decide what kind");
		System.out.println("of meal you should have and how you should prepare it!");
		System.out.println();
		System.out.println("Please enter the type of event you need food for: ");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		String eventType = scan.next();
		
					
		
		System.out.println("You have chosen a " + eventType + " event.");
		System.out.println();
		
		System.out.println("Please enter the number of people in your party: ");
		
		Scanner scan2 = new Scanner(System.in);
				int partySize = scan.nextInt();
		
		System.out.println("You have " + partySize + " in your party.");
		System.out.println();
		
		String mealSug = "empty";
		switch(eventType) {
		case "casual":
			mealSug = "sandwiches";
			break;
		case "semi-formal":
			mealSug = "fried chicken";
			break;
		case "formal":
			mealSug = "chicken parmesan";
			break;
		}
	String prepSug = "null";
	
			if (partySize < 2) {
				prepSug = (" in the microwave");
			}
			else if (partySize > 12) {
				prepSug = (" by a caterer");
			}
				else {
				prepSug = (" in your kitchen");
			}
		
		String result = "Given that the event is "+eventType +" you should have "
		+mealSug +" and since there will be "+partySize + 
		" people, it should be prepared" +prepSug +".";
		
		System.out.println(result);
		
				
			}}
