import static org.junit.Assert.assertTrue;



import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter shelter = new VirtualPetShelter();
	VirtualPet testPet = new VirtualPet("david", "cat");
	VirtualPet testPet2 = new VirtualPet("jack", "dog");
	VirtualPet testPet3 = new VirtualPet("jane", "lizard");

	@Test
	public void shouldBeAbleToAddPet() {
		int beginningSize = shelter.getAllPets().size();
		shelter.addPet("david", testPet);
		int endingSize = shelter.getAllPets().size();
		assertTrue(endingSize > beginningSize);
	}

	@Test
	public void shouldBeAbleToRemovePet() {
		shelter.addPet("david", testPet);
		int beginningSize = shelter.getAllPets().size();
		shelter.removePet("david");
		int endingSize = shelter.getAllPets().size();
		assertTrue(endingSize < beginningSize);
	}

	@Test
	public void shouldBeAbleToFeedAllPets() {
		shelter.addPet("david", testPet);
		shelter.addPet("jack", testPet2);
		shelter.addPet("jane", testPet3);
		int startingHunger1 = shelter.getPet("david").getHunger();
		int startingHunger2 = shelter.getPet("jack").getHunger();
		int startingHunger3 = shelter.getPet("jane").getHunger();
		shelter.feedAllPets();
		int endingHunger1 = shelter.getPet("david").getHunger();
		int endingHunger2 = shelter.getPet("jack").getHunger();
		int endingHunger3 = shelter.getPet("jane").getHunger();
		assertTrue(startingHunger1 > endingHunger1);
		assertTrue(startingHunger2 > endingHunger2);
		assertTrue(startingHunger3 > endingHunger3);
	}

	@Test
	public void shouldBeAbleToWaterAllPets() {
		shelter.addPet("david", testPet);
		shelter.addPet("jack", testPet2);
		shelter.addPet("jane", testPet3);
		int startingThirst1 = shelter.getPet("david").getThirst();
		int startingThirst2 = shelter.getPet("jack").getThirst();
		int startingThirst3 = shelter.getPet("jane").getThirst();
		shelter.waterAllPets();
		int endingThirst1 = shelter.getPet("david").getThirst();
		int endingThirst2 = shelter.getPet("jack").getThirst();
		int endingThirst3 = shelter.getPet("jane").getThirst();
		assertTrue(startingThirst1 > endingThirst1);
		assertTrue(startingThirst2 > endingThirst2);
		assertTrue(startingThirst3 > endingThirst3);
	}

	@Test
	public void shouldBeAbleToPlayWithOnePet() {
		shelter.addPet("david", testPet);
		shelter.addPet("jack", testPet2);
		shelter.addPet("jane", testPet3);
		float startingHappiness1 = shelter.getPet("david").getHappiness();
		float startingHappiness2 = shelter.getPet("jack").getHappiness();
		float startingHappiness3 = shelter.getPet("jane").getHappiness();
		shelter.playWithSinglePet("david");
		float endingHappiness1 = shelter.getPet("david").getHappiness();
		int endingHappiness2 = shelter.getPet("jack").getHappiness();
		int endingHappiness3 = shelter.getPet("jane").getHappiness();
		assertTrue(startingHappiness1 < endingHappiness1);
		assertTrue(startingHappiness2 == endingHappiness2);
		assertTrue(startingHappiness3 == endingHappiness3);
	}

	@Test
	public void shouldBeAbleToWaterOnePet() {
		shelter.addPet("david", testPet);
		shelter.addPet("jack", testPet2);
		shelter.addPet("jane", testPet3);
		int startingThirst1 = shelter.getPet("david").getThirst();
		int startingThirst2 = shelter.getPet("jack").getThirst();
		int startingThirst3 = shelter.getPet("jane").getThirst();
		shelter.giveDrinkToSinglePet("david");
		int endingThirst1 = shelter.getPet("david").getThirst();
		int endingThirst2 = shelter.getPet("jack").getThirst();
		int endingThirst3 = shelter.getPet("jane").getThirst();
		assertTrue(startingThirst1 > endingThirst1);
		assertTrue(startingThirst2 == endingThirst2);
		assertTrue(startingThirst3 == endingThirst3);
	}

	@Test
	public void shouldBeAbleToFeedOnePet() {
		shelter.addPet("david", testPet);
		shelter.addPet("jack", testPet2);
		shelter.addPet("jane", testPet3);
		int startingHunger1 = shelter.getPet("david").getHunger();
		int startingHunger2 = shelter.getPet("jack").getHunger();
		int startingHunger3 = shelter.getPet("jane").getHunger();
		shelter.giveFoodToSinglePet("david");
		int endingHunger1 = shelter.getPet("david").getHunger();
		int endingHunger2 = shelter.getPet("jack").getHunger();
		int endingHunger3 = shelter.getPet("jane").getHunger();
		assertTrue(startingHunger1 > endingHunger1);
		assertTrue(startingHunger2 == endingHunger2);
		assertTrue(startingHunger3 == endingHunger3);
	}

	@Test
	public void shouldChangePetWithTick() {
		shelter.addPet("david", testPet);
		shelter.addPet("jack", testPet2);
		shelter.addPet("jane", testPet3);
		int startingHunger1 = shelter.getPet("david").getHunger();
		int startingHunger2 = shelter.getPet("jack").getHunger();
		int startingHunger3 = shelter.getPet("jane").getHunger();
		int startingThirst1 = shelter.getPet("david").getThirst();
		int startingThirst2 = shelter.getPet("jack").getThirst();
		int startingThirst3 = shelter.getPet("jane").getThirst();
		int startingHappiness1 = shelter.getPet("david").getHappiness();
		int startingHappiness2 = shelter.getPet("jack").getHappiness();
		int startingHappiness3 = shelter.getPet("jane").getHappiness();
		int startingBoredom1 = shelter.getPet("david").getBoredom();
		int startingBoredom2 = shelter.getPet("jack").getBoredom();
		int startingBoredom3 = shelter.getPet("jane").getBoredom();
		shelter.tick();
		int endingHunger1 = shelter.getPet("david").getHunger();
		int endingHunger2 = shelter.getPet("jack").getHunger();
		int endingHunger3 = shelter.getPet("jane").getHunger();
		int endingThirst1 = shelter.getPet("david").getThirst();
		int endingThirst2 = shelter.getPet("jack").getThirst();
		int endingThirst3 = shelter.getPet("jane").getThirst();
		int endingHappiness1 = shelter.getPet("david").getHappiness();
		int endingHappiness2 = shelter.getPet("jack").getHappiness();
		int endingHappiness3 = shelter.getPet("jane").getHappiness();
		int endingBoredom1 = shelter.getPet("david").getBoredom();
		int endingBoredom2 = shelter.getPet("jack").getBoredom();
		int endingBoredom3 = shelter.getPet("jane").getBoredom();
		assertTrue(startingHunger1 < endingHunger1);
		assertTrue(startingHunger2 < endingHunger2);
		assertTrue(startingHunger3 < endingHunger3);
		assertTrue(startingHappiness1 > endingHappiness1);
		assertTrue(startingHappiness2 > endingHappiness2);
		assertTrue(startingHappiness3 > endingHappiness3);
		assertTrue(startingThirst1 < endingThirst1);
		assertTrue(startingThirst2 < endingThirst2);
		assertTrue(startingThirst3 < endingThirst3);
		assertTrue(startingBoredom1 < endingBoredom1);
		assertTrue(startingBoredom2 < endingBoredom2);
		assertTrue(startingBoredom3 < endingBoredom3);

	}

	@Test
	public void shouldBeAbleToCleanCageOfOnePet() {
		shelter.addPet("david", testPet);
		shelter.addPet("jack", testPet2);
		shelter.addPet("jane", testPet3);
		int startingCleanliness1 = shelter.getPet("david").getCageCleanliness();
		int startingCleanliness2 = shelter.getPet("jack").getCageCleanliness();
		int startingCleanliness3 = shelter.getPet("jane").getCageCleanliness();
		shelter.cleanSinglePetCage("david");
		int endingCleanliness1 = shelter.getPet("david").getCageCleanliness();
		int endingCleanliness2 = shelter.getPet("jack").getCageCleanliness();
		int endingCleanliness3 = shelter.getPet("jane").getCageCleanliness();
		assertTrue(startingCleanliness1 > endingCleanliness1);
		assertTrue(startingCleanliness2 == endingCleanliness2);
		assertTrue(startingCleanliness3 == endingCleanliness3);
	}

}