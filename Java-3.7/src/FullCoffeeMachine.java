public class FullCoffeeMachine implements EspressoMaker, CappuccinoMaker, LatteMaker {
    @Override
    public void makeEspresso() {
        System.out.println("Prepar espresso intens.");
    }

    @Override
    public void makeCappuccino() {
        System.out.println("Prepar cappuccino cremos.");
    }

    @Override
    public void makeLatte() {
        System.out.println("Prepar latte cu lapte spumat.");
    }
}
