public abstract class VirtualPet {
    protected String petName;
    protected String description;
    protected int happiness;
    protected int health;


    public VirtualPet(String petName, String description, int happiness, int health) {
        this.petName = petName;
        this.description = description;
        this.happiness = happiness;
        this.health = health;
    }

    public String findName() {
        return petName;

    }

    public String getDescription() {
        return description;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth() {
        health -= 5;
    }

    public void increaseHealth() {
        health += 10;
    }

    public void play() {
        happiness += 10;
    }
}