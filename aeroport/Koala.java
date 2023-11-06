package aeroport;

public class Koala extends Mammifere implements Herbivore {

    public Koala(String nom, int poids) {
        super(nom, poids);
    }
    @Override
    public void brouter() {
        System.out.println("Je mange des feuilles d'Eucalyptus");
    }
}
