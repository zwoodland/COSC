import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager {
    private ArrayList<Hero> heroes; // List of heroes

    // Constructor to initialize the ArrayList
    public HeroManager() {
        this.heroes = new ArrayList<>();
    }

    // Method to add a hero to the list
    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    // Method to remove a hero by name
    public void removeHero(String name) {
        heroes.removeIf(hero -> hero.getName().equals(name));
    }

    // Bubble Sort to arrange heroes by their power level in ascending order
    public void bubbleSortHeroes() {
        for (int i = 0; i < heroes.size() - 1; i++) {
            for (int j = 0; j < heroes.size() - 1 - i; j++) {
                if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()) {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }

    // Insertion Sort to arrange heroes by their power level in ascending order
    public void insertionSortHeroes() {
        for (int i = 1; i < heroes.size(); i++) {
            Hero key = heroes.get(i);
            int j = i - 1;

            // Move elements of heroes[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()) {
                heroes.set(j + 1, heroes.get(j));
                j = j - 1;
            }
            heroes.set(j + 1, key);
        }
    }

    // Method to display heroes in a 2D array format
    public void displayHeroesIn2DArray() {
        // Create a 2D array where each row represents a hero's information
        String[][] heroArray = new String[heroes.size()][3];
        for (int i = 0; i < heroes.size(); i++) {
            Hero hero = heroes.get(i);
            heroArray[i][0] = hero.getName();
            heroArray[i][1] = String.valueOf(hero.getPowerLevel());
            heroArray[i][2] = hero.getAffiliation().toString();
        }

        // Print the 2D array using Arrays.deepToString to display hero data
        System.out.println(Arrays.deepToString(heroArray));
    }

    // Method to display heroes in a list format
    public void displayHeroes() {
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
}
