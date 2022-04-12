package ru.rob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private final Logger LOGGER = LoggerFactory.getLogger(CommandLineRunnerImpl.class);

    public void run(String... args) throws Exception {
        LOGGER.info("EXECUTING : command line runner");
//        modelService.tryRequest();
    }

}
