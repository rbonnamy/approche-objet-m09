package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String[] args) {
        ArrayList<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        ArrayList<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> liste3 = new ArrayList<>();
        for (String couleur : liste1){
            liste3.add(couleur);
        }
        for (String couleur : liste2){
            if (!liste3.contains(couleur)) {
                liste3.add(couleur);
            }
        }
        System.out.println(liste3);
    }
}
