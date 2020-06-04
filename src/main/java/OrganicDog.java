public class OrganicDog extends OrganicPets implements Walking, GetAllAttributes, IncreaseAttributes {

    protected int dirtiness;

    public OrganicDog(String petName, String description, int happiness, int health, int hunger, int thirst, int boredom, int dirtiness) {
        super(petName, description, happiness, health, hunger, thirst, boredom);
        this.dirtiness = dirtiness;

    }

    public int getDirtiness() {
        return dirtiness;
    }

    public void clean() {
        dirtiness -= 10;
    }

    @Override
    public void walk() {
        happiness += 10;
        boredom -= 5;
        dirtiness -= 2;
    }

    @Override
    public String getAllAttributes() {
        String hungStr = String.valueOf(getHunger());
        String healthStr = String.valueOf(getHealth());
        String happStr = String.valueOf(getHappiness());
        String thirStr = String.valueOf(getThirst());
        String boreStr = String.valueOf(getBoredom());
        String dirStr = String.valueOf(getDirtiness());
        return "\t" + hungStr + "\t | \t" + happStr + "\t | \t" + thirStr + "\t | \t" + boreStr + "\t | \t" + healthStr + "\t | \t" + dirStr;
    }

    @Override
    public void increaseAttributes() {
        hunger += 3;
        thirst += 3;
        happiness -= 3;
        boredom += 3;
        dirtiness += 3;
    }
}

