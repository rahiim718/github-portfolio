import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Who is the best dog ever? (Enter your dogs name)");

        String petName = input.nextLine();

		VirtualPet myPet = new VirtualPet(petName,10, 10, 10, 10, 10);

		String decision = "";
		while (!decision.equalsIgnoreCase("Yes")) {

			System.out.println("\n" + petName + " the Dog");
			System.out.println("\nHunger:    " + myPet.getHunger());
			System.out.println("Water:     " + myPet.getThirst());
			System.out.println("Waste:     " + myPet.getWaste());
			System.out.println("Bored:     " + myPet.getBored());
			System.out.println("Tiredness: " + myPet.getSleepy());

			String optionEntered = "";

			System.out.println("\nWhat would you like to do today?");
			System.out.println("1. Feed " + petName + "");
			System.out.println("2. Water " + petName + "");
			System.out.println("3. Take " + petName + " for a walk to the Potty");
			System.out.println("4. Play with " + petName + "");
			System.out.println("5. Put " + petName + " to Sleep");
			System.out.println("6. Do nothing...");
			System.out.println("7. Terminate Virtual Pet...");
			optionEntered = input.nextLine();

			int hunger = 1;
			int water = 1;
			int waste = 1;
			int bored = 1;
			int tired = 1;

			if (optionEntered.equals("1")) {
				myPet.feedPet();
				System.out.println("Fed " + petName + " " + hunger + " Scooby Snacks.");
				System.out.println("Feeding " + petName + " a Scooby Snacks took away " + water + " water while adding " + waste
						+ " to waste and making " + petName + " tired by " + tired);

			} else if (optionEntered.equals("2")) {
				myPet.getThirst();
				System.out.println("Gave " + petName + " " + water + " water and now " + petName + " feels restored.");
				System.out.println("Added " + waste + " to waste.");

			} else if (optionEntered.equals("3")) {
				myPet.hasWaste();
				System.out.println("So many places outside for taking a potty.");
				System.out.println("Take " + petName + " for a walk to the potty. -" + waste + " to waste.");
				System.out.println("" + petName + " is now a little sleepy. +" + tired);

			} else if (optionEntered.equals("4")) {
				myPet.isBored();
				System.out.println("Decided to play with " + petName + ". " + petName + " barks and chases tail.");
				System.out.println("Playing with " + petName + " added +" + bored);
				System.out.println("" + petName + " is now a little sleepy. +" + tired);

			} else if (optionEntered.equals("5")) {
				myPet.sleepy();
				System.out.println("" + petName + " is very sleepy and end up in his bed...");
				System.out.println("" + petName + " is now sleeping and it took -" + tired);

			} else if (optionEntered.equals("6")) {
				System.out.println("By doing nothing. " + petName + " is now confused.");

			} else {
				optionEntered.equals("7");
				System.out.println("Are you sure you wish to Terminate " + petName + " and quit program?");
				System.out.println("Enter Yes or No");
				decision = input.nextLine();

				if (decision.equalsIgnoreCase("Yes")) {
					System.out.println("" + petName + " is sad and has a look of betrayal on his face.");
					System.out.println("" + petName + " is not your friend anymore...");

				} else {
					decision.equalsIgnoreCase("No");
					System.out.println("Thanks for not terminating your friend.");
					System.out.println("Friends to the end...");
				}
			}
			myPet.tick();
		} // end of while

		input.close();
	}
}