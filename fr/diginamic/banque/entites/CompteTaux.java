package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double taux;

    public CompteTaux(String numero, double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    public void calculerSolde() {
       // calcul nouveau solde
    }

    @Override
    public String toString(){

        return super.toString()+" , taux="+taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
