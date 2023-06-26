import java.util.Arrays;

public class Swim {
    private Shark[] sharks;
    private Duck[] ducks;
    private Crocodile[] crocodiles;

    public Swim() {
    }

    public Swim(Shark[] sharks, Duck[] ducks, Crocodile[] crocodiles) {
        this.sharks = sharks;
        this.ducks = ducks;
        this.crocodiles = crocodiles;
    }

    public Shark[] getSharks() {
        return sharks;
    }

    public void setSharks(Shark[] sharks) {
        this.sharks = sharks;
    }

    public Duck[] getDucks() {
        return ducks;
    }

    public void setDucks(Duck[] ducks) {
        this.ducks = ducks;
    }

    public Crocodile[] getCrocodiles() {
        return crocodiles;
    }

    public void setTurtles(Crocodile[] crocodiles) {
        this.crocodiles = crocodiles;
    }

    @Override
    public String toString() {
        return "Swimming: " + "\n" +
                "sharks: " + Arrays.toString(sharks) +
                "ducks: " + Arrays.toString(ducks) +
                "crocodiles: " + Arrays.toString(crocodiles);
    }
}

