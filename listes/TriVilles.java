package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TriVilles {
    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        Collections.sort(villes); // C'est cette méthode qui utilise compareTo

        // Google Guava : manipulation des collections.
        for (Ville v: villes){
            System.out.println(v);
        }

        System.out.println("------------------------------");
        System.out.println("Second tri avec ComparatorHabitant : ");

        // Tri avec ComparatorHabitant
        Collections.sort(villes, new ComparatorHabitant());

        // Affichage du résultat
        for (Ville v: villes){
            System.out.println(v);
        }

        System.out.println("------------------------------");
        System.out.println("Second tri avec ComparatorNom : ");

        // Tri avec ComparatorHabitant
        Collections.sort(villes, new ComparatorNom());

        // Affichage du résultat
        for (Ville v: villes){
            System.out.println(v);
        }

        // Avec référence de méthode
        Collections.sort(villes, Comparator.comparing(Ville::getNbHabs));
        Collections.sort(villes, Comparator.comparing(Ville::getNom));
    }
}
