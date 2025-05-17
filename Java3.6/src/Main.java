public class Main {
    public static void main(String[] args) {
        // Injectăm SimpleCoffeeMachine (doar espresso)
        User user1 = new User(new SimpleCoffeeMachine(), null, null);
        System.out.println("User1 folosește SimpleCoffeeMachine:");
        user1.run();

        System.out.println();

        // Injectăm AdvancedCoffeeMachine (espresso + cappuccino)
        AdvancedCoffeeMachine advancedMachine = new AdvancedCoffeeMachine();
        User user2 = new User(advancedMachine, advancedMachine, null);
        System.out.println("User2 folosește AdvancedCoffeeMachine:");
        user2.run();

        System.out.println();

        // Injectăm FullCoffeeMachine (espresso + cappuccino + latte)
        FullCoffeeMachine fullMachine = new FullCoffeeMachine();
        User user3 = new User(fullMachine, fullMachine, fullMachine);
        System.out.println("User3 folosește FullCoffeeMachine:");
        user3.run();
    }
}
