# Interface in Java (Einführung)
 Aufgabe 3: Schnittstellen
Beschreibung
In dieser Aufgabe habe ich eine Schnittstelle CanRandomize und drei Klassen implementiert.

Schnittstelle
CanRandomize schreibt die Methode randomize() vor, die zufällige Werte für alle Attribute setzt.

Klassen
Wuerfel – definiert durch Breite, Höhe und Tiefe
Person – definiert durch Name und Alter
BenotetesModul – definiert durch Modulname, Matrikelnummer und Note

Jede Klasse besitzt:
Einen Standardkonstruktor und einen Konstruktor mit Parametern
Getter und Setter für alle Attribute
Eine toString()-Methode
Eine randomize()-Methode mit plausiblen Zufallswerten

Zufallswerte
Wuerfel: Breite, Höhe und Tiefe werden zufällig zwischen 1 und 100 gesetzt
Person: Ein echter Name wird aus einer Liste gewählt, Alter wird zwischen 1 und 99 gesetzt
BenotetesModul: Nur gültige deutsche Noten (1.0, 1.3 ... 5.0), 6-stellige Matrikelnummer zwischen 100000 und 999999

Wie habe ich das Ergebnis erhalten ?
Interface CanRandomize mit Methode randomize() erstellt
Drei Klassen mit implements CanRandomize erstellt
In jeder Klasse die Methode randomize() mit plausiblen Zufallswerten implementiert
Im Main jede Klasse mit normalen Werten erstellt, dann randomize() aufgerufen
 Und Manuell
1.Datei Main.java in IntelliJ geöffnet
2.Auf den grünen Pfeil ▶️ neben public static void main(String[] args) geklickt
3.Das Ergebnis erscheint automatisch im Run-Fenster unten in IntelliJ

##Beispielausgabe
![Beispielausgabe](
