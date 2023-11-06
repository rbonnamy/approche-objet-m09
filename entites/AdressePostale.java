package entites;

public class AdressePostale {
    // Les attributs de la classe sont toujours directement dans la classe
    private int numeroRue;
    private String libelleRue;
    private int codePostal;
    private String ville;

    // Variable static ou de classe => valeur unique
    public static final int NB_REGIONS = 17;

    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int departement(){
        return codePostal/1000;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }

    public int getNumeroRue() {
        return numeroRue;
    }

    public String getLibelleRue() {
        return libelleRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public void setLibelleRue(String libelleRue) {
        this.libelleRue = libelleRue;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
