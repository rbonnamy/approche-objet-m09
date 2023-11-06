package entites;

public class Facture {
    private double consommation;
    private double montant;

    public Facture(double consommation) {
        this.consommation = consommation;
        this.montant = consommation * 0.15;
    }

    public void modifierConsommation(double consommation) {
        this.consommation = consommation;
        this.montant = consommation * 0.15;
    }

    public double getConsommation() {
        return consommation;
    }

    public double getMontant() {
        return montant;
    }
}
