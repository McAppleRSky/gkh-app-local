package ru.rob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsoleApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootConsoleApplication.class);

    public static void main(String[] args) {
        logger.info("STARTING THE APPLICATION");
        SpringApplication.run(SpringBootConsoleApplication.class);
        logger.info("APPLICATION FINISHED");
    }

}
