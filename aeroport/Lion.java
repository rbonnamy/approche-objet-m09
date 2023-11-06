package aeroport;

public class Lion extends Mammifere implements Carnivore {

    public Lion(String nom, int poids) {
        super(nom, poids);
    }

    @Override
    public void chasserProie() {
        System.out.println("Je chasse des proies");
    }
}
