package NathanStPierre.aquarium;

public class PoissonClown extends Poisson {

    public PoissonClown(String nom, int age, String couleur) {
        super(nom, age, couleur);
    }

    @Override
    public void manger() {
        System.out.println(nom + " mange des micro-organismes (petits crustacés, vers, algues, etc.");
    }
}
