public class Main {
    public static void main(String[] args) {
        // Create a HeroManager instance to manage the list of heroes
        HeroManager heroManager = new HeroManager();

        // Create heroes with their attributes (name, power level, affiliation)
        Hero hero1 = new Hero("Captain America", 100, Affiliation.AVENGERS);
        Hero hero2 = new Hero("Batman", 90, Affiliation.JUSTICE_LEAGUE);
        Hero hero3 = new Hero("Iron Man", 120, Affiliation.AVENGERS);
        Hero hero4 = new Hero("Spider-Man", 85, Affiliation.AVENGERS);

        // Add heroes to the system
        heroManager.addHero(hero1);
        heroManager.addHero(hero2);
        heroManager.addHero(hero3);
        heroManager.addHero(hero4);

        // Display original list of heroes
        System.out.println("Original List of Heroes:");
        heroManager.displayHeroes();

        // Sort heroes using Bubble Sort
        heroManager.bubbleSortHeroes();
        System.out.println("\nHeroes Sorted by Power Level (Bubble Sort):");
        heroManager.displayHeroes();

        // Sort heroes using Insertion Sort
        heroManager.insertionSortHeroes();
        System.out.println("\nHeroes Sorted by Power Level (Insertion Sort):");
        heroManager.displayHeroes();

        // Remove a hero by name (e.g., Batman)
        heroManager.removeHero("Batman");
        System.out.println("\nList after Removing Batman:");
        heroManager.displayHeroes();

        // Add a new hero (e.g., Black Panther)
        Hero hero5 = new Hero("Black Panther", 110, Affiliation.AVENGERS);
        heroManager.addHero(hero5);
        System.out.println("\nList after Adding Black Panther:");
        heroManager.displayHeroes();

        // Display heroes in 2D array format
        System.out.println("\nHeroes in 2D Array Format:");
        heroManager.displayHeroesIn2DArray();
    }
}
