import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {

	VirtualPet testPet = new VirtualPet("mary", "sweet turtle");

	@Test
	public void shouldBeAbleToLowerHungerWhenFed() {
		int startingHunger = testPet.getHunger();
		testPet.giveFood();
		int endingHunger = testPet.getHunger();
		assertTrue(endingHunger < startingHunger);
	}

	@Test
	public void shouldBeAbleToLowerThirstWhenGivenDrink() {
		int startingThirst = testPet.getThirst();
		testPet.giveDrink();
		int endingThirst = testPet.getThirst();
		assertTrue(endingThirst < startingThirst);
	}

	@Test
	public void shouldGetHappierWhenPlayedWithAndDecreaseBored() {
		int startingHappiness = testPet.getHappiness();
		int startingBored = testPet.getBoredom();
		testPet.playWith();
		int endingHappiness = testPet.getHappiness();
		int endingBored = testPet.getBoredom();
		assertTrue(endingHappiness > startingHappiness);
		assertTrue(endingBored < startingBored);
	}

}