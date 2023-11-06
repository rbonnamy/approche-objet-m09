package entites2;

import entites.AdressePostale;

/**
 * Cette classe représente le concept de Personne dans l'application.
 */
public class Personne extends Object {

    private String nom; // <== ça c'est this.nom
    private String prenom;
    private AdressePostale adresse; // Ici on a une association

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    // Méthode redéfinie de la classe Object
    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }
}
