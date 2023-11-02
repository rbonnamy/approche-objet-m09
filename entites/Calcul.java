package entites;

public class Calcul {

    // Classe sans attribut : stateless

    public int addition(int a, int b){
        afficher();
        return a + b;
    }

    public void afficher(){
        System.out.println("La méthode addition vient d'être invoquée");
    }

}
