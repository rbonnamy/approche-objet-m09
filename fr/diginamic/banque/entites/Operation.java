package fr.diginamic.banque.entites;

public abstract class Operation {

    private String date;
    private double montant;

    // Le constructeur n'est plus appelable avec new
    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    public abstract String getType();

    public abstract double imputerMontant(double total);

    @Override
    public String toString() {
        return "Operation{" +
                "type="+getType()+
                ", date=" + date +
                ", montant=" + montant +
                "}";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
