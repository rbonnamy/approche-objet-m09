package aeroport;

public class Vache extends Mammifere implements Herbivore {

    public Vache(String nom, int poids) {
        super(nom, poids);
    }
    @Override
    public void brouter() {

        System.out.println("Je mange de l'herbe ou du foin");
    }
}
