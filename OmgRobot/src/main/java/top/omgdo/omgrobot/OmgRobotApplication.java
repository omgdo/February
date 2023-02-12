package top.omgdo.omgrobot;

import love.forte.simbot.spring.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSimbot
public class OmgRobotApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmgRobotApplication.class, args);
    }

}
