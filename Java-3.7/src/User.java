public class User {
    private EspressoMaker espressoMaker;
    private CappuccinoMaker cappuccinoMaker;
    private LatteMaker latteMaker;

    // Setteri publici (injecție din exterior)
    public void setEspressoMaker(EspressoMaker espressoMaker) {
        this.espressoMaker = espressoMaker;
    }

    public void setCappuccinoMaker(CappuccinoMaker cappuccinoMaker) {
        this.cappuccinoMaker = cappuccinoMaker;
    }

    public void setLatteMaker(LatteMaker latteMaker) {
        this.latteMaker = latteMaker;
    }

    public void run() {
        if (espressoMaker != null) espressoMaker.makeEspresso();
        if (cappuccinoMaker != null) cappuccinoMaker.makeCappuccino();
        if (latteMaker != null) latteMaker.makeLatte();
    }
}
