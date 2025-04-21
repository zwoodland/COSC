public class SuperheroRoster {
 
    public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
        String[] heroNames = {"Iron Man", "Hulk", "Thor"};
        String[] abilities = {"Flying and high-tech armor", "Superhuman strength and durability", "Thunder and control over lightning"};
        int[] powerLevels = {90, 95, 85};
 
        // 2. Print each hero's details using a loop
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Hero: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println(); // Empty line for clarity
        }
 
        // 3. Call the searchHero method to find a specific hero by name
        searchHero(heroNames, abilities, powerLevels, "Iron Man");
 
        // 4. Calculate and display the average power level by calling calculateAveragePower method
        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + averagePower);
 
        // Optional: Create an array of Superhero objects and display their details
        Superhero[] superheroes = {
            new Superhero("Iron Man", "Flying and high-tech armor", 90),
            new Superhero("Hulk", "Superhuman strength and durability", 95),
            new Superhero("Thor", "Thunder and control over lightning", 85)
        };

        System.out.println("\nSuperheroes Display:");
        for (Superhero hero : superheroes) {
            hero.displayHero();
        }
    }
 
    // Method: searchHero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Hero Found: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found: " + target);
        }
    }
 
    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return sum / (double) powerLevels.length;
    }
}

// Superhero class
class Superhero {
    // Declare attributes: name, ability, and powerLevel
    private String name;
    private String ability;
    private int powerLevel;
 
    // Constructor to initialize name, ability, and powerLevel
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }
 
    // Method: displayHero
    public void displayHero() {
        System.out.println("Hero: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
        System.out.println(); // Empty line for clarity
    }
}
