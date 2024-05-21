package uk.co.ashleyfrieze.robotleg;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.co.ashleyfrieze.robotleg.model.Robot;

@SpringBootApplication
public class RobotlegApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(RobotlegApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RobotlegApplication.class, args);
	}

	@Autowired
	private Robot robot;

	@PostConstruct
	public void postInit() {
		LOGGER.info("Robot time");
		LOGGER.info(robot.toString());
	}

}
