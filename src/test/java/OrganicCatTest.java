import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrganicCatTest {

    OrganicCat underTest = new OrganicCat("butterball", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10, 10, 10);

    @Test
    public void shouldFindName() {
        String foundPet = underTest.findName();
        Assertions.assertThat(foundPet).isEqualToIgnoringCase("butterball");
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
    public void shouldReturnValueOfAttributes() {
        String attributes = underTest.getAllAttributes();
        Assertions.assertThat(attributes).isEqualTo("10 " + "|10" + " |10" + " |10" + " |10");
    }

    @Test
    public void shouldDecreaseHungerBy5AfterEating() {
        underTest.feed(5);
        int hungerAfterEating = underTest.getHunger();
        Assertions.assertThat(hungerAfterEating).isEqualTo(5);

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
}
