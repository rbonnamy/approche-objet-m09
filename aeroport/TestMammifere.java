package aeroport;

import java.util.ArrayList;
import java.util.Date;

public class TestMammifere {
    public static void main(String[] args) {
        ArrayList<String> maListe = new ArrayList<>();
        maListe.add("Coucou");

    }

    public static void afficherMammifere(Mammifere mam) {
        // Code compliqué ici
    }

    public static void afficherCarnivore(Carnivore carn) {
        carn.chasserProie();
    }

    public static void afficherHerbivore(Herbivore herb) {
        herb.brouter();
    }
}
