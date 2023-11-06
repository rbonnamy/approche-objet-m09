package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteCourant;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        CompteCourant cpt = new CompteCourant("FR25412", 15500.0);
        CompteTaux cptTaux = new CompteTaux("FR564651", 12.5, 3.0);

        Compte[] comptes = {cpt, cptTaux};

        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }
    }
}
