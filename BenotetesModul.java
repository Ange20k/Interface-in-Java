

import java.util.Random;

public class BenotetesModul implements CanRandomize {

    private String modulName;
    private int    matrikelnummer;
    private double note;

    // Constructeur vide
    public BenotetesModul() {
        this.modulName       = "";
        this.matrikelnummer  = 0;
        this.note            = 0;
    }

    // Constructeur avec paramètres
    public BenotetesModul(String modulName, int matrikelnummer, double note) {
        this.modulName      = modulName;
        this.matrikelnummer = matrikelnummer;
        this.note           = note;
    }

    // Getters
    public String getModulName()      { return modulName; }
    public int    getMatrikelnummer() { return matrikelnummer; }
    public double getNote()           { return note; }

    // Setters
    public void setModulName(String modulName)         { this.modulName      = modulName; }
    public void setMatrikelnummer(int matrikelnummer)  { this.matrikelnummer = matrikelnummer; }
    public void setNote(double note)                   { this.note           = note; }

    // Valeurs aléatoires plausibles
    public void randomize() {
        Random random = new Random();

        // Noms de modules possibles
        String[] module = {"OOP", "Mathe", "Physik", "Datenbanken", "Algorithmen"};
        this.modulName = module[random.nextInt(module.length)];

        // Matrikelnummer entre 100000 et 999999
        this.matrikelnummer = random.nextInt(900000) + 100000;

        // Note entre 1.0 et 5.0 (valeurs valides en Allemagne)
        double[] noten = {1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3, 3.7, 4.0, 5.0};
        this.note = noten[random.nextInt(noten.length)];
    }

    public String toString() {
        return "BenotetesModul [Modul=" + modulName
                + ", Matrikelnummer=" + matrikelnummer
                + ", Note=" + note + "]";
    }
}
