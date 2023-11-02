package entites;

public class TestEmprunt {

    public static void main(String[] args) {
        Emprunt emp1 = new Emprunt(2023);
        Emprunt emp2 = new Emprunt(2024);
        Emprunt emp3 = new Emprunt(2022);

        System.out.println(emp1.annee);
        System.out.println(emp2.annee);
        System.out.println(emp3.annee);

        int a = 5;
        int b = a;

        System.out.println(b);
    }
}
