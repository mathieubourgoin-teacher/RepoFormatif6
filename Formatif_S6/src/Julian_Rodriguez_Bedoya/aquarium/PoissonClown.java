package Julian_Rodriguez_Bedoya.aquarium;

public class PoissonClown extends Poisson {

    public PoissonClown(String nom, int age, String couleur) {
        super(nom, age, couleur);
    }

    @Override
    public void manger() {
        System.out.println("Le poisson " + nom + " mange des hot-dogs");
    }
}
