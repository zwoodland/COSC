public class Hero {
    private String name;          // Hero's name
    private int powerLevel;       // Hero's power level
    private Affiliation affiliation; // Hero's team affiliation (AVENGERS, JUSTICE_LEAGUE, etc.)

    // Constructor to initialize the hero's attributes
    public Hero(String name, int powerLevel, Affiliation affiliation) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;
    }

    // Getter methods to retrieve hero's information
    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    // Method to return a string representation of the hero
    @Override
    public String toString() {
        return "Hero{name='" + name + "', powerLevel=" + powerLevel + ", affiliation=" + affiliation + "}";
    }
}
