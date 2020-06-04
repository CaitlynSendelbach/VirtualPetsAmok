public class OrganicPets extends VirtualPet implements GetAllAttributes {

    protected int hunger;
    protected int thirst;
    protected int boredom;

    public OrganicPets(String petName, String description, int happiness, int health, int hunger, int thirst, int boredom) {
        super(petName, description, happiness, health);
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void feed(int amount) {
        hunger -= amount;
    }

    public void water(int amount) {
        thirst -= amount;
    }

    public void play(int amount) {
        boredom -= amount;
    }


    @Override
    public String getAllAttributes() {
        String hungStr = String.valueOf(getHunger());
        String happStr = String.valueOf(getHappiness());
        String thirStr = String.valueOf(getThirst());
        String boreStr = String.valueOf(getBoredom());
        String healthStr = String.valueOf(getHealth());
        return "\t" + hungStr + "\t | \t" + happStr + "\t | \t" + thirStr + "\t | \t" + boreStr + "\t | \t" + healthStr;
    }

}
