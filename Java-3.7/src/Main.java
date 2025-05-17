public class Main {
    public static void main(String[] args) {
        // User 1 - simplu
        User user1 = new User();
        user1.setEspressoMaker(new SimpleCoffeeMachine());
        System.out.println("User1 folosește SimpleCoffeeMachine:");
        user1.run();

        System.out.println();

        // User 2 - avansat
        User user2 = new User();
        AdvancedCoffeeMachine advanced = new AdvancedCoffeeMachine();
        user2.setEspressoMaker(advanced);
        user2.setCappuccinoMaker(advanced);
        System.out.println("User2 folosește AdvancedCoffeeMachine:");
        user2.run();

        System.out.println();

        // User 3 - full
        User user3 = new User();
        FullCoffeeMachine full = new FullCoffeeMachine();
        user3.setEspressoMaker(full);
        user3.setCappuccinoMaker(full);
        user3.setLatteMaker(full);
        System.out.println("User3 folosește FullCoffeeMachine:");
        user3.run();
    }
}
