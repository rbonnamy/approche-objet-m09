package entites;

import entites2.Client;
import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr = new AdressePostale(50, "place du Marché", 44100, "Nantes");
        AdressePostale adr2 = new AdressePostale(51, "place du Marché", 44100, "Nantes");
        Personne p1 = new Personne("LEE", "Arg", adr);


        Personne p2 = new Personne("Kiop", "Paul");

        Client c1 = new Client("HHH", "ljlk", 127);
        System.out.println(c1);

    }
}
