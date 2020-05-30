public class Dog {

    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int boredom;

    public Dog(String name, String description, int hunger, int thirst, int boredom) {
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.thirst= thirst;
        this.boredom = boredom;
    }


    public String getPetName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getReal() {
        return true;
    }

    public int getHunger() {
        return hunger;
    }

    public void feedPet() {
        hunger = hunger - 5;
    }

    public int getThirst() {
        return thirst;
    }

    public void waterPet() {
        thirst = thirst - 5;
    }

    public int getBoredom() {
        return boredom;
    }

    public void walkDogs() {
        boredom = boredom - 10;
    }
}
