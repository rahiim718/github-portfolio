public class VirtualPet {
    //main needs of my virtual pet
    private String petName;
    private int hunger;
	private int thirst;
	private int waste;
	private int bored;
	private int sleepy;

    // Constructor
    public VirtualPet(String petName, int hunger, int thirst, int waste, int bored, int sleepy) {
		this.petName = petName;
        this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.bored = bored;
		this.sleepy = sleepy;        
    }

    //tick method loop
    public void tick() {
        hunger++;
        thirst++;
        waste--;
        bored--;
        sleepy--;
    }

    //create getter methods
    public String getName() {
        return petName;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getWaste() {
        return waste;
    }

    public int getBored() {
        return bored;
    }

    public int getSleepy() {
        return sleepy;
    }

//methods needed to increase/decrease my pet needs
    public void feedPet() {
        hunger -= 2;
        thirst -= 2;
        waste += 2;
        sleepy -= 1;
    }

    public void drinkWater() {
		thirst -= 2;
        waste += 1;
	}

	public void hasWaste() {
		waste -= 3;

	}

	public void isBored() {
		bored -= 1;
		sleepy += 1;
	}

	public void sleepy() {
		sleepy -= 1;
	} 


}