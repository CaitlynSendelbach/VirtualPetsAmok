import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    int litterBoxWaste;

    Map<String, VirtualPet> shelter = new HashMap<>();

    public Collection<VirtualPet> getAllPets() {
        return shelter.values();
    }

    public String showOrganicPets() {
        for (VirtualPet petInfo : getAllPets()) {
            if (petInfo instanceof OrganicCat) {
                System.out.println(petInfo.findName() + " |" + ((OrganicCat) petInfo).getAllAttributes() + "\t | \t" + litterBoxWaste);
            }
            if (petInfo instanceof OrganicDog) {
                System.out.println(petInfo.findName() + " |" + ((OrganicDog) petInfo).getAllAttributes());
            }
        }
        return "";
    }

    public String showRoboticPets() {
        for (VirtualPet petInfo : getAllPets()) {
            if (petInfo instanceof RoboticPets) {
                System.out.println(petInfo.findName() + " |" + ((RoboticPets) petInfo).getAllAttributes());
            }
        }
        return "";
    }

    public void add(VirtualPet pet) {
        shelter.put(pet.findName(), pet);
    }

    public VirtualPet findPet(String petName) {
        return shelter.get(petName);
    }

    public void adopt(VirtualPet pet) {
        shelter.remove(pet.findName(), pet);
    }

    public void feedAllPets() {
        for (VirtualPet petInfo : shelter.values()) {
            if (petInfo instanceof OrganicPets) {
                ((OrganicPets) petInfo).feed(5);
            }
        }
    }

    public void waterAllPets() {
        for (VirtualPet petInfo : shelter.values()) {
            if (petInfo instanceof OrganicPets) {
                ((OrganicPets) petInfo).water(5);
            }
        }
    }

    public void playWithAllPets() {
        for (VirtualPet petInfo : shelter.values()) {
            if (petInfo instanceof OrganicPets) {
                ((OrganicPets) petInfo).play(5);
            }
        }
    }

    public void walkAllDogs() {
        for (VirtualPet petInfo : shelter.values())
            if (petInfo instanceof Walking) {
                ((Walking) petInfo).walk();
            }
    }

    public void oilAllRoboticPets() {
        for (VirtualPet petInfo : shelter.values()) {
            if (petInfo instanceof RoboticPets) {
                ((RoboticPets) petInfo).oilRoboticPets();
            }
        }
    }


    public void playWithOnePet(String petName) {
        for (VirtualPet petInfo : shelter.values()) {
            petInfo = findPet(petName);
            petInfo.play();

        }
    }

    public String showDescriptions() {
        for (VirtualPet petInfo : getAllPets()) {
            System.out.println(petInfo.findName() + " " + petInfo.getDescription());
        }
        return "";
    }

    public void increaseBoxWaste() {
        for (VirtualPet petInfo : shelter.values()) {
            if (petInfo instanceof OrganicCat) {
                litterBoxWaste += 5;
            }
        }
    }

    public void cleanLitterBox() {
        litterBoxWaste -= 15;
    }

    public int getLitterBoxWaste() {
        return litterBoxWaste;
    }

    public void tick() {
        for (VirtualPet petInfo : shelter.values()) {
            if (petInfo instanceof OrganicCat && ((OrganicCat) petInfo).getHunger() < 50 || petInfo instanceof OrganicCat && ((OrganicCat) petInfo).getThirst() < 50) {
                petInfo.increaseHealth();
                ((OrganicCat) petInfo).increaseAttributes();
                increaseBoxWaste();
            }
            if (litterBoxWaste >= 50 && petInfo instanceof OrganicCat || petInfo instanceof OrganicCat && ((OrganicCat) petInfo).getHunger() >= 50 || petInfo instanceof OrganicCat && ((OrganicCat) petInfo).getThirst() >= 50) {
                petInfo.decreaseHealth();
                ((OrganicCat) petInfo).increaseAttributes();
                increaseBoxWaste();
            }
            if (petInfo instanceof OrganicDog && ((OrganicDog) petInfo).getThirst() < 50 || petInfo instanceof OrganicDog && ((OrganicDog) petInfo).getHunger() < 50) {
                petInfo.increaseHealth();
                ((OrganicDog) petInfo).increaseAttributes();
            }
            if (petInfo instanceof OrganicDog && ((OrganicDog) petInfo).getDirtiness() >= 50 || petInfo instanceof OrganicDog && ((OrganicDog) petInfo).getHunger() >= 50 || petInfo instanceof OrganicDog && ((OrganicDog) petInfo).getThirst() >= 50) {
                petInfo.decreaseHealth();
                ((OrganicDog) petInfo).increaseAttributes();
            }
            if (petInfo instanceof RoboticPets && ((RoboticPets) petInfo).getOilLevel() > 50) {
                petInfo.increaseHealth();
                ((RoboticPets) petInfo).increaseAttributes();
            }
            if (petInfo instanceof RoboticPets && ((RoboticPets) petInfo).getOilLevel() <= 50) {
                petInfo.decreaseHealth();
                ((RoboticPets) petInfo).increaseAttributes();
            }
        }
    }

    public void cleanPetCage(String petName) {
        if (findPet(petName) instanceof OrganicDog) {
            OrganicDog petCageToClean = (OrganicDog) findPet(petName);
            petCageToClean.clean();
        } else System.out.println("This is not an organic dog with a cage!");
    }


    public void cleanAllCages() {
        for (VirtualPet petInfo : shelter.values()) {
            if (petInfo instanceof OrganicDog) {
                ((OrganicDog) petInfo).clean();
            }
        }
    }
}
