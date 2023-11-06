package listes;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int nbHabs;

    public Ville(String nom, int nbHabs) {
        this.nom = nom;
        this.nbHabs = nbHabs;
    }

    @Override
    public int compareTo(Ville autre) {
        if (this.getNbHabs() > autre.getNbHabs()){
            return -1; // Ville passé en paramètre + grande que this
        }
        else if (this.getNbHabs() < autre.getNbHabs()){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "nom=" + nom +
               ", nbHabs=" + nbHabs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabs() {
        return nbHabs;
    }

    public void setNbHabs(int nbHabs) {
        this.nbHabs = nbHabs;
    }

}
