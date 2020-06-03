
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    VirtualPetShelter underTest;
    OrganicPets pet1 = new OrganicDog("Rusty", "German Shep", 10, 10, 10, 10, 10, 10);
    OrganicPets pet2 = new OrganicCat("Butterball", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10, 10, 10);
    RoboticPets pet3 = new RobotDog("Lazy", "White robo", 10, 10, 10);
    RoboticPets pet4 = new RobotCat("Satan", "Robo cat", 10, 10, 10);
    OrganicPets pet5 = new OrganicDog("Lazy", "German Shep", 10, 10, 10, 10, 10, 10);

    @Test
    public void hungerShouldGoDownForAllPetsBy1WhenFed() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.add(pet3);
        underTest.add(pet4);
        underTest.feedAllPets();
        assertEquals(5, pet1.getHunger());
        assertEquals(5, pet2.getHunger());
    }

    @Test
    public void shouldReduceThirstBy1ForAllPetsWhenWatered() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.waterAllPets();
        assertEquals(5, pet1.getThirst());
        assertEquals(5, pet2.getThirst());
    }

    @Test
    public void shouldReduceBoredomBy1WhenPlaying() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.add(pet3);
        underTest.add(pet4);
        underTest.playWithAllPets();
        assertEquals(5, pet1.getBoredom());
        assertEquals(5, pet2.getBoredom());
    }

    @Test
    public void shouldAddOnePet() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        VirtualPet retrievedPet = underTest.findPet("Rusty");
        Assertions.assertThat(retrievedPet.equals(pet1));
    }

    @Test
    public void shouldRemoveOnePet() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.adopt(pet1);
        VirtualPet retrievedPet = underTest.findPet((pet1).findName());
        assertEquals(retrievedPet, null);
    }

    @Test
    public void shouldAddFourPets() {
        underTest = new VirtualPetShelter();
        underTest.add(pet2);
        underTest.add(pet1);
        underTest.add(pet3);
        underTest.add(pet4);
        Collection<VirtualPet> allPets = underTest.getAllPets();
        Assertions.assertThat(allPets.contains(pet1));
        Assertions.assertThat(allPets.contains(pet2));
        Assertions.assertThat(allPets.contains(pet3));
        Assertions.assertThat(allPets.contains(pet4));
    }

    @Test
    public void shouldIncreaseHappinessBy5ForDogsWhenWalking() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.add(pet3);
        underTest.add(pet4);
        underTest.walkAllDogs();
        assertEquals(20, pet1.getHappiness());
        assertEquals(10, pet2.getHappiness());
        assertEquals(20, pet3.getHappiness());
        assertEquals(10, pet4.getHappiness());
    }

    @Test
    public void shouldIncreaseOilLevelForRobotPetsBy5WhenOiled() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.add(pet3);
        underTest.add(pet4);
        underTest.oilAllRoboticPets();
        assertEquals(20, pet3.getOilLevel());
        assertEquals(20, pet4.getOilLevel());
    }

    @Test
    public void shouldIncreaseLitterboxWasteForCats() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.add(pet3);
        underTest.add(pet4);
        underTest.increaseBoxWaste();
        assertEquals(5, underTest.getLitterBoxWaste());
        underTest.increaseBoxWaste();
        assertEquals(10, underTest.getLitterBoxWaste());

    }

    @Test
    public void shouldIncreaseHealthBy5ForPets() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.tick();
        assertEquals(20, pet1.getHealth());
        assertEquals(20, pet2.getHealth());
    }

    @Test
    public void shouldDecreaseHealthBy5ForRoboticPets() {
        underTest = new VirtualPetShelter();
        underTest.add(pet3);
        underTest.add(pet4);
        underTest.tick();
        assertEquals(5, pet3.getHealth());
        assertEquals(5, pet4.getHealth());
    }

    @Test
    public void shouldCleanAllDogsCages() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.add(pet3);
        underTest.add(pet4);
        underTest.add(pet5);
        underTest.cleanAllCages();
        assertEquals(0, ((OrganicDog) pet1).getDirtiness());
        assertEquals(0, ((OrganicDog) pet5).getDirtiness());
    }

    @Test
    public void shouldCleanOneDogCage() {
        underTest = new VirtualPetShelter();
        underTest.add(pet1);
        underTest.add(pet5);
        underTest.cleanPetCage("Rusty");
        assertEquals(0, ((OrganicDog) pet1).getDirtiness());
        assertEquals(10, ((OrganicDog) pet5).getDirtiness());
    }


}