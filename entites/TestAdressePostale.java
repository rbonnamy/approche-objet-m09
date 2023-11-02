package entites;

public class TestAdressePostale {

    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(5, "place du Marché", 44000, "Nantes");
        AdressePostale adr2 = new AdressePostale(15, "avenue Java", 34500, "Pérols");

        int dept1 = adr1.departement();
        int dept2 = adr2.departement();

        System.out.println(dept1);
        System.out.println(dept2);

    }
}
