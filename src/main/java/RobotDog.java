public class RobotDog extends RoboticPets implements Walking {
    public RobotDog(String petName, String description, int happiness, int health, int oilLevel) {
        super(petName, description, happiness, health, oilLevel);
    }

    @Override
    public void walk() {
        happiness += 10;
    }
}
