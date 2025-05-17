public class Main {
    public static void main(String[] args) {
        System.out.println("SimpleCoffeeMachine:");
        SimpleCoffeeMachine simple = new SimpleCoffeeMachine();
        simple.makeEspresso();

        System.out.println("\nAdvancedCoffeeMachine:");
        AdvancedCoffeeMachine advanced = new AdvancedCoffeeMachine();
        advanced.makeEspresso();
        advanced.makeCappuccino();

        System.out.println("\nFullCoffeeMachine:");
        FullCoffeeMachine full = new FullCoffeeMachine();
        full.makeEspresso();
        full.makeCappuccino();
        full.makeLatte();
    }
}
