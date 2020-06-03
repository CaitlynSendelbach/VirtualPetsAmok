import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class OrganicDogTest {

    OrganicDog underTest = new OrganicDog("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10, 10, 10, 10);


    @Test
    public void shouldFindName() {
        String foundPet = underTest.findName();
        Assertions.assertThat(foundPet).isEqualToIgnoringCase("Rusty");
    }

    @Test
    public void shouldFindDescription() {
        String foundPet = underTest.getDescription();
        Assertions.assertThat(foundPet).isEqualToIgnoringCase("smells like a Stargazer lily fresh with morning dew");
    }

    @Test
    public void shouldReturnValueOfHunger() {
        int foundPet = underTest.getHunger();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfThirst() {
        int foundPet = underTest.getThirst();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfBoredom() {
        int foundPet = underTest.getBoredom();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfAttributes() {
        String attributes = underTest.getAllAttributes();
        Assertions.assertThat(attributes).isEqualTo("10" + " |10" + " |10" + " |10" + " |10" + " |10");
    }

    @Test
    public void shouldIncreaseHappinessby5AfterWalking() {
        underTest.walk();
        int happinessAfterWalking = underTest.getHappiness();
        Assertions.assertThat(happinessAfterWalking).isEqualTo(15);
    }

    @Test
    public void shouldDecreaseHungerBy5AfterEating() {
        underTest.feed(5);
        int hungerAfterEating = underTest.getHunger();
        Assertions.assertThat(hungerAfterEating).isEqualTo(5);

    }

    @Test
    public void shouldReduceBoredomBy5WhenWalking() {
        underTest.walk();
        int boredomAfterWalking = underTest.getBoredom();
        Assertions.assertThat(boredomAfterWalking).isEqualTo(5);
    }

    @Test
    public void shouldDecreaseThirstBy5AfterDrinking() {
        underTest.water(5);
        int thirstAfterDrinking = underTest.getThirst();
        Assertions.assertThat(thirstAfterDrinking).isEqualTo(5);

    }

    @Test
    public void shouldReduceBoredomBy5WhenPlay() {
        underTest.play(5);
        int boredomAfterWalking = underTest.getBoredom();
        Assertions.assertThat(boredomAfterWalking).isEqualTo(5);
    }

    @Test
    public void shouldReduceCleanlinessBy2WhenWalking() {
        underTest.walk();
        int cleanlinessAfterWalking = underTest.getDirtiness();
        Assertions.assertThat(cleanlinessAfterWalking).isEqualTo(8);
    }

    @Test
    public void shouldReduceDirtinessBy10WhenCleaning() {
        underTest.clean();
        int cleanlinessAfterCleaning = underTest.getDirtiness();
        Assertions.assertThat(cleanlinessAfterCleaning).isEqualTo(0);
    }


}



