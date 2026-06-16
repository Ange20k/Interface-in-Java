
import java.util.Random;

public class Person implements CanRandomize {

    private String name;
    private int    alter;

    // Constructeur vide
    public Person() {
        this.name  = "";
        this.alter = 0;
    }

    // Constructeur avec paramètres
    public Person(String name, int alter) {
        this.name  = name;
        this.alter = alter;
    }

    // Getters
    public String getName() { return name; }
    public int    getAlter() { return alter; }

    // Setters
    public void setName(String name)   { this.name  = name; }
    public void setAlter(int alter)    { this.alter = alter; }

    // Valeurs aléatoires plausibles
    public void randomize() {
        Random random = new Random();

        // Noms possibles
        String[] namen = {"Anna", "Max", "Lisa", "Tom", "Sara", "Felix"};
        this.name  = namen[random.nextInt(namen.length)];

        // Âge entre 1 et 99
        this.alter = random.nextInt(99) + 1;
    }

    public String toString() {
        return "Person [Name=" + name + ", Alter=" + alter + "]";
    }
}