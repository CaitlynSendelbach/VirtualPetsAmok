public class OrganicCat extends OrganicPets implements IncreaseAttributes {
    public OrganicCat(String petName, String description, int happiness, int health, int hunger, int thirst, int boredom) {
        super(petName, description, happiness, health, hunger, thirst, boredom);
    }

    @Override
    public void increaseAttributes() {
        hunger += 3;
        thirst += 3;
        happiness -= 3;
        boredom += 3;
    }
}