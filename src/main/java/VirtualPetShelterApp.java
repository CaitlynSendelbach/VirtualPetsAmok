import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userAction = 0;
        String userInput;
        VirtualPetShelter shelterPets = new VirtualPetShelter();
        shelterPets.add(new OrganicDog("Rusty", "German Shepard", 10, 10, 10, 10, 10, 10));
        shelterPets.add(new OrganicCat("Satan", "Black Cat", 10, 10, 10, 10, 10));
        shelterPets.add(new RobotDog("Piper", "Gold Corgi", 10, 10, 55));
        shelterPets.add(new RobotCat("Boomer", "Silver Cat", 10, 10, 55));

        System.out.println("Thank you for volunteering at Hare's Pet Shelter!");
        System.out.println();


        while (userAction != 14) {
            System.out.println();
            System.out.println("This is the status of your pets:");
            System.out.println();
            System.out.println("Name: " + "Hunger: " + "Happiness: " + "Thirst: " + "Boredom: " + "Health: " + "Cleanliness:");
            System.out.println("------|---|---|---|---|---|");
            System.out.println(shelterPets.showOrganicPets());
            System.out.println();
            System.out.println("Robotic Pets:");
            System.out.println("Name: " + "Happiness: " + "Health: " + "Oil Level: ");
            System.out.println("------|---|---|");
            System.out.println(shelterPets.showRoboticPets());
            System.out.println();
            System.out.println("What would you like to do next?");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Walk all the dogs");
            System.out.println("5. Clean a pets cage");
            System.out.println("6. Clean All Dogs Cages");
            System.out.println("7. Clean cat litter box");
            System.out.println("8. Oil Robotic Pets");
            System.out.println("9. Adopt a pet");
            System.out.println("10. Admit an organic dog");
            System.out.println("11. Admit an organic cat");
            System.out.println("12. Admit a robotic dog");
            System.out.println("13. Admit a robotic cat");
            System.out.println("14. Quit");
            userAction = input.nextInt();
            input.nextLine();
            if (userAction == 1) {
                System.out.println("You have chosen to feed the pets");
                shelterPets.feedAllPets();
            }
            if (userAction == 2) {
                System.out.println("You have chose to water the pets");
                shelterPets.waterAllPets();
            }
            if (userAction == 3) {
                System.out.println("Which pet would you like to play with?");
                System.out.println(shelterPets.showDescriptions());
                userInput = input.nextLine();
                System.out.println();
                System.out.println("Ok you play with " + userInput);
                shelterPets.playWithOnePet(userInput);
            }
            if (userAction == 4) {
                System.out.println("You have chosen to walk all of the dogs!");
                shelterPets.walkAllDogs();
            }
            if (userAction == 5) {
                System.out.println("Which pets cage would you like to clean?");
                userInput = input.nextLine();
                System.out.println("You have chosen to clean " + userInput + "s cage!");
                shelterPets.cleanPetCage(userInput);
            }
            if (userAction == 6) {
                System.out.println("You have chose to clean all of the dogs cages!");
                shelterPets.cleanAllCages();
            }
            if (userAction == 7) {
                System.out.println("You have chosen to clean the communal litter box!");
                shelterPets.cleanLitterBox();
            }
            if (userAction == 8) {
                System.out.println("You have chosen to oil all the robotic pets!");
                shelterPets.oilAllRoboticPets();
            }
            if (userAction == 9) {
                System.out.println("Which pet would you like to adopt?");
                shelterPets.showDescriptions();
                userInput = input.nextLine();
                System.out.println("You have chosen to adopt " + userInput);
                System.out.println("Take good care of them! Give them lots of love...and snacks!");
                shelterPets.adopt(shelterPets.findPet(userInput));
            }
            if (userAction == 10) {
                String petDescription;
                System.out.println("You would like to admit an Organic Dog!");
                System.out.println("Please enter their name");
                userInput = input.nextLine();
                System.out.println("Please enter their description");
                petDescription = input.nextLine();
                shelterPets.add(new OrganicDog(userInput, petDescription, 10, 10, 10, 10, 10, 10));
                System.out.println("We will take good care of " + userInput);
            }
            if (userAction == 11) {
                String petDescription;
                System.out.println("You would like to admit an Organic Cat!");
                System.out.println("Please enter their name");
                userInput = input.nextLine();
                System.out.println("Please enter their description");
                petDescription = input.nextLine();
                shelterPets.add(new OrganicCat(userInput, petDescription, 10, 10, 10, 10, 10));
                System.out.println("We will take good care of " + userInput);
            }
            if (userAction == 12) {
                String petDescription;
                System.out.println("You would like to admit an Robotic Dog!");
                System.out.println("Please enter their name");
                userInput = input.nextLine();
                System.out.println("Please enter their description");
                petDescription = input.nextLine();
                shelterPets.add(new RobotCat(userInput, petDescription, 10, 10, 10));
                System.out.println("We will take good care of " + userInput);
            }
            if (userAction == 13) {
                String petDescription;
                System.out.println("You would like to admit an Robot Cat!");
                System.out.println("Please enter their name");
                userInput = input.nextLine();
                System.out.println("Please enter their description");
                petDescription = input.nextLine();
                shelterPets.add(new RobotCat(userInput, petDescription, 10, 10, 10));
                System.out.println("We will take good care of " + userInput);
            }
            shelterPets.tick();

        }
    }


}
