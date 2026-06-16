
public class Main {
    public static void main(String[] args) {

        // Test Wuerfel
        System.out.println("=== Wuerfel ===");
        Wuerfel w1 = new Wuerfel(5, 10, 3);
        System.out.println(w1);
        w1.randomize();
        System.out.println("Nach randomize: " + w1);

        // Test Person
        System.out.println("=== Person ===");
        Person p1 = new Person("Max", 25);
        System.out.println(p1);
        p1.randomize();
        System.out.println("Nach randomize: " + p1);

        // Test BenotetesModul
        System.out.println("=== BenotetesModul ===");
        BenotetesModul m1 = new BenotetesModul("OOP", 123456, 1.7);
        System.out.println(m1);
        m1.randomize();
        System.out.println("Nach randomize: " + m1);
    }
}