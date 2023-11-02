package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr = new AdressePostale(50, "place du Marché", 44100, "Nantes");

        Personne p = new Personne("LEE", "Arg", adr);
    }
}
