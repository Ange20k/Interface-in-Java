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
Wuerfel: Werte zwischen 1 und 100
Person: echter Name aus einer Liste, Alter zwischen 1 und 99
BenotetesModul: gültige deutsche Note (1.0 bis 5.0), 6-stellige Matrikelnummer

