
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RobotCatTest {

    RobotCat underTest = new RobotCat("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 0, 10);

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
    public void shouldIncreaseOilLevelBy5WhenOiling() {
        underTest.oilRoboticPets();
        int oilLevelAfterOiling = underTest.getOilLevel();
        Assertions.assertThat(oilLevelAfterOiling).isEqualTo(20);
    }

    @Test
    public void shouldIncreaseHealthLevelBy5WhenOiling() {
        underTest.oilRoboticPets();
        int oilLevelAfterOiling = underTest.getHealth();
        Assertions.assertThat(oilLevelAfterOiling).isEqualTo(10);
    }

}
