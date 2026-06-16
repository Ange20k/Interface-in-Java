

import java.util.Random;

public class Wuerfel implements CanRandomize {

    private double breite;  // largeur
    private double hoehe;   // hauteur
    private double tiefe;   // profondeur

    // Constructeur vide
    public Wuerfel() {
        this.breite = 0;
        this.hoehe  = 0;
        this.tiefe  = 0;
    }

    // Constructeur avec paramètres
    public Wuerfel(double breite, double hoehe, double tiefe) {
        this.breite = breite;
        this.hoehe  = hoehe;
        this.tiefe  = tiefe;
    }

    // Getters
    public double getBreite() { return breite; }
    public double getHoehe()  { return hoehe; }
    public double getTiefe()  { return tiefe; }

    // Setters
    public void setBreite(double breite) { this.breite = breite; }
    public void setHoehe(double hoehe)   { this.hoehe  = hoehe; }
    public void setTiefe(double tiefe)   { this.tiefe  = tiefe; }

    // Valeurs aléatoires entre 1 et 100
    public void randomize() {
        Random random  = new Random();
        this.breite = random.nextDouble(100) + 1;
        this.hoehe  = random.nextDouble(100) + 1;
        this.tiefe  = random.nextDouble(100) + 1;
    }

    public String toString() {
        return "Wuerfel [Breite=" + breite
                + ", Hoehe=" + hoehe
                + ", Tiefe=" + tiefe + "]";
    }
}