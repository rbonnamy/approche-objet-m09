package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom; // <== ça c'est this.nom
    public String prenom;
    public AdressePostale adresse;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                '}';
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
