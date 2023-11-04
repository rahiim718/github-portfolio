import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelter = new VirtualPetShelter();

		VirtualPet marley = new VirtualPet("Marley", " the cat like to chill all day", 50,50,20,50);
		VirtualPet cory = new VirtualPet("Cory", " barks too much.", 50,50,20,50);
		VirtualPet nancy = new VirtualPet("Nancy", " is one cool cat.", 50,50,20,50);
		VirtualPet tony = new VirtualPet("Tony", " is a very friendly dog.", 50,50,20,50);
		
		shelter.addPet("Marley", marley);
		shelter.addPet("Cory", cory);
		shelter.addPet("Nancy", nancy);
		shelter.addPet("Tony", tony);
		
		String ready;
		
		int menuInput;
		
		boolean playingGame = false;
		
		System.out.println("Let's play Virtual Pet Shelter!");
		do {
			System.out.println("\nAre you ready to Manage this Amazing Shelter?(y/n)");
			ready = input.nextLine();
		} while (!ready.equals("y"));
		playingGame = true;
		while (playingGame) {
			do {
				System.out.println("\nHere are all your pets:\n");
				System.out.println("|Name   | Hunger   | Thirst   | Boredom   |Happiness");
				System.out.println("|-------|----------|----------|-----------|---------|");
				for (VirtualPet pet : shelter.getAllPets().values()) {
					System.out.println(pet);
				}
				System.out.println("\nWhat would you like to do?\n");
				System.out.println("Enter 1 to feed all pets.");
				System.out.println("Enter 2 to water all pets.");
				System.out.println("Enter 3 to feed just one pet.");
				System.out.println("Enter 4 to water just one pet.");
				System.out.println("Enter 5 to play with one pet.");
				System.out.println("Enter 6 to adopt a pet.");
				System.out.println("Enter 7 to admit a pet to the shelter.");
				System.out.println("Enter 8 to do nothing.");
				System.out.println("Enter 0 to quit.");
				menuInput = input.nextInt();
				input.nextLine();

			} while (menuInput != 1 && menuInput != 2 && menuInput != 3 && menuInput != 4 && menuInput != 5
			&& menuInput != 6 && menuInput != 7 && menuInput != 8 && menuInput != 0);
			
			switch (menuInput) {
				case 1:
					System.out.println("\nYou want to feed all the pets! Good for you!");
					shelter.feedAllPets();
				break;
				case 2:
					System.out.println("\nGood thinking, all the pets are thirsty.");
					shelter.waterAllPets();
				break;
				case 3:	
					System.out.println("\nOne pet must be particularly hungry.");
					System.out.println("Which would you like to feed?");
					String name = input.nextLine();
					shelter.giveFoodToSinglePet(name);
				break;
				case 4:
					System.out.println("\nOne pet must be particularly thirsty.");
					System.out.println("Which would you like to give a drink to?");
					name = input.nextLine();
					shelter.giveDrinkToSinglePet(name);
				break;
				case 5:
					System.out.println("\nLet's Play!\n");
					for (VirtualPet pet : shelter.getAllPets().values()) {
						System.out.println(pet.getName() +  " " + pet.getDescription());
					}
						System.out.println("\nWhich pet would you like to play with?");
						name = input.nextLine();
						shelter.playWithSinglePet(name);
				break;
				case 6:
					System.out.println("\nAlright! A pet is getting adopted!");
					System.out.println("Who is the lucky pet?");
					name = input.nextLine();
					shelter.removePet(name);	
				break;
				case 7:
					System.out.println("\nWe will help this new pet find a home as soon as possible!");
					System.out.println("What is this new pets name?");
					name = input.nextLine();
					System.out.println("\nDescribe the pet briefly.");
					String description = input.nextLine();
					VirtualPet newPet = new VirtualPet(name, description, 50, 50, 20, 50);				
					shelter.addPet(name, newPet);
				break;
				case 8:
					shelter.tick();
					shelter.tick();
				break;
				case 0:
					System.out.println("Goodbye. \nThe pets will miss you, will you miss them?");
					playingGame = false;
				break;
			}	
			shelter.tick();
		}//end of while
		
		input.close();
	}
}
