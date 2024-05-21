package uk.co.ashleyfrieze.robotleg.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    private Leg leftLeg;
    private Leg rightLeg;

    public Robot(@Qualifier("leftleg") Leg leftLeg, @Qualifier("rightleg") Leg rightLeg) {
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                '}';
    }
}
