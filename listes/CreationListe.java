package listes;

import java.util.ArrayList;
import java.util.Collections;

public class CreationListe {

    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(125);
        liste.add(8);
        liste.add(-10);
        liste.add(0);
        liste.add(7);

        Collections.sort(liste); // Réorganise la liste entièrement

        System.out.println(liste);

    }
}
