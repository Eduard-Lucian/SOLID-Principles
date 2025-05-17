public class AdvancedCoffeeMachine implements EspressoMaker, CappuccinoMaker {
    @Override
    public void makeEspresso() {
        System.out.println("Prepar espresso delicios.");
    }

    @Override
    public void makeCappuccino() {
        System.out.println("Prepar cappuccino cu spumă fină.");
    }
}
