public class RoboticPets extends VirtualPet implements IncreaseAttributes, GetAllAttributes {
    private int oilLevel;

    public RoboticPets(String petName, String description, int happiness, int health, int oilLevel) {
        super(petName, description, happiness, health);
        this.oilLevel = oilLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void oilRoboticPets() {
        oilLevel += 10;
        health += 10;
    }

    @Override
    public void increaseAttributes() {
        happiness -= 3;
        oilLevel -= 3;
    }

    @Override
    public String getAllAttributes() {
        String happStr = String.valueOf(happiness);
        String healthStr = String.valueOf(health);
        String oilStr = String.valueOf(oilLevel);
        return happStr + " |" + healthStr + " |" + oilStr;
    }
}
