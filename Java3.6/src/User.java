public class User {
    private EspressoMaker espressoMaker;
    private CappuccinoMaker cappuccinoMaker;
    private LatteMaker latteMaker;

    // Constructor DI (injectăm doar ce are user-ul)
    public User(EspressoMaker espressoMaker, CappuccinoMaker cappuccinoMaker, LatteMaker latteMaker) {
        this.espressoMaker = espressoMaker;
        this.cappuccinoMaker = cappuccinoMaker;
        this.latteMaker = latteMaker;
    }

    public void run() {
        if (espressoMaker != null) {
            espressoMaker.makeEspresso();
        }
        if (cappuccinoMaker != null) {
            cappuccinoMaker.makeCappuccino();
        }
        if (latteMaker != null) {
            latteMaker.makeLatte();
        }
    }
}
