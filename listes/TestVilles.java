package listes;

import java.util.ArrayList;

public class TestVilles {
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

        Ville vMin = villes.get(0);
        Ville vMax = villes.get(0);

        for (Ville v: villes){
            if (v.getNbHabs() > vMax.getNbHabs()) {
                vMax = v;
            }
            if (v.getNbHabs() < vMin.getNbHabs()){
                vMin = v;
            }
            if (v.getNbHabs() >= 100000){
                String nom = v.getNom();
                v.setNom(nom.toUpperCase());
            }
        }
        System.out.println("Ville min:"+vMin);
        System.out.println("Ville max:"+vMax);

        // Suppression ville avec le moins d'habitants
        villes.remove(vMin);

        System.out.println("---------------------------");
        // Affichage final
        for (Ville v: villes){
            System.out.println(v);
        }
    }
}
