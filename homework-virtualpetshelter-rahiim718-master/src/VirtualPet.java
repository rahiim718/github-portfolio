public class VirtualPet {
	//main needs of the virual pet
	private String name;
	private String description;
	private int hunger;
	private int thirst;
	private int boredom;
	private int happiness;
	private int cageCleanliness;


	VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// Constructors
	public VirtualPet(String name, String description, int hunger, int thirst, int boredom, int happiness) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.happiness = happiness;
	}

	@Override
	public String toString() {
		return name + "      " + hunger + "          " + thirst + "          " + boredom + "           " + happiness; 
	}

	//create getter methods
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getCageCleanliness() {
		return cageCleanliness;
	}

	//methods needed to increase/decrease my pet needs
	public void cleanCage() {
		cageCleanliness -= 1;
	}

	public void makeCageDirty() {
		cageCleanliness += 1;
	}

    public void giveFood() {
		hunger -= 15;
		thirst += 2;
		happiness += 3;
	}

	public void giveDrink() {
		thirst -= 15;
		hunger += 2;
		happiness += 3;
	}

	public void increaseBoredom() {
		boredom += 5;
	}

	public void increaseHunger() {
		hunger += 5;
	}

	public void increaseThirst() {
		thirst += 5;
	}

	public void decreaseHappiness() {
		happiness -= 5;
	}

	public void playWith() {
		happiness += 4;
		boredom -= 3;
	}

}