package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.util.ArrayList;
import java.util.Iterator;

public class TestOperation {
    public static void main(String[] args) {

        Credit c1 = new Credit("01/11/2023", 125.5);
        Credit c2 = new Credit("01/11/2023", 13.2);
        Debit d1 = new Debit("03/11/2023", 28.0);
        Debit d2 = new Debit("04/11/2023", 14.15);

        ArrayList<Operation> opes = new ArrayList<>();
        opes.add(c1);
        opes.add(c2);
        opes.add(d1);
        opes.add(d2);

        double total = 0.0;

        // Pas une bonne pratique du tout !!!!! : même si ça semble fonctionner
        Iterator<Operation> iter = opes.iterator();

        // Tant que l'itérateur a encore des éléments je continue
        while (iter.hasNext()){

            // Je récupéère l'élément suivant dans la liste
            // et j'avance d'une case dans la liste
            Operation ope = iter.next();
            if (ope.getMontant() > 100.0){
                iter.remove(); // La suppression passe par l'itérateur
            }
        }

    }
}
