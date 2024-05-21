package uk.co.ashleyfrieze.robotleg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.co.ashleyfrieze.robotleg.model.LeftFoot;
import uk.co.ashleyfrieze.robotleg.model.Leg;
import uk.co.ashleyfrieze.robotleg.model.RightFoot;

@Configuration
public class RobotConfiguration {
    @Bean
    public Leg leftleg(LeftFoot foot){
        return new Leg(foot);
    }

    @Bean
    public Leg rightleg(RightFoot foot){
        return new Leg(foot);
    }
}
