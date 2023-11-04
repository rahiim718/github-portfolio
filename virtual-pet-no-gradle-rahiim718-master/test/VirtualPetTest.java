import org.junit.*;

public class VirtualPetTest {
    VirtualPet testPet = new VirtualPet("Marley",8, 4, 5, 6, 4);

    @Test
    public void testFeedPet(){
        testPet.feedPet();
        Assert.assertEquals(6,testPet.getHunger());
        Assert.assertEquals(2, testPet.getThirst());
        Assert.assertEquals(7, testPet.getWaste());
        Assert.assertEquals(3, testPet.getSleepy());
    }

        @Test
        public void testDrinkWater(){
        testPet.drinkWater();
        Assert.assertEquals(2, testPet.getThirst());
        Assert.assertEquals(6, testPet.getWaste());
    }
    
        @Test
        public void testHasWaste(){
        testPet.hasWaste();
        Assert.assertEquals(2, testPet.getWaste());
    }

        @Test
        public void testIsBored(){
        testPet.isBored();
        Assert.assertEquals(5, testPet.getBored());
        Assert.assertEquals(5, testPet.getSleepy());
        }

        @Test
        public void testSleepy(){
        testPet.sleepy();
        Assert.assertEquals(3, testPet.getSleepy());

        }

    }


