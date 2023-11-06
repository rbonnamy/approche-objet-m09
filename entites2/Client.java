package entites2;

public class Client extends Personne {

    private int numero;
    private double solde;

    public Client(String nom, String prenom, int numero) {
        super(nom, prenom);
        this.numero = numero;
    }

    @Override
    public String toString() {
        String identite = super.toString();
        return identite +
                ", numero=" + numero +
                ", solde=" + solde;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
