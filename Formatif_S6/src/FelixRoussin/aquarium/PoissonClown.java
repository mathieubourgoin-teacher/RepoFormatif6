package FelixRoussin.aquarium;

public class PoissonClown extends Poisson {

    public PoissonClown(String nom, int age, String couleur) {
        super(nom, age, couleur);
    }

    @Override
    public void manger() {
        System.out.println(nom + " mange des micro organismes aquatiques tell que des zooplanctons ou copépodes et même des petits crustacés ");
    }
}
