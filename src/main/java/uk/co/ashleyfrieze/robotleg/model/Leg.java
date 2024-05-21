package uk.co.ashleyfrieze.robotleg.model;

public class Leg {
    private Foot foot;

    public Leg(Foot foot) {
        this.foot = foot;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "foot=" + foot +
                '}';
    }
}
