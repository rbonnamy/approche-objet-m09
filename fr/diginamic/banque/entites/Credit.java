package fr.diginamic.banque.entites;

public class Credit extends Operation {

    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String getType() {
        return "Crédit";
    }

    @Override
    public double imputerMontant(double total){
        return total+getMontant();
    }

}
