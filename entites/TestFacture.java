package entites;

public class TestFacture {
    public static void main(String[] args) {
        Facture f = new Facture(100.0);
        System.out.println(f.getMontant());

        f.modifierConsommation(110.0);
        System.out.println(f.getMontant());
    }
}
