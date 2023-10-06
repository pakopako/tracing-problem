package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Hooks;
import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class Demo2Application {

    private static final Log logger = LogFactory.getLog(Demo2Application.class);

    @RequestMapping("/")
    Mono<String> home() {
        logger.info("home() has been called");
        return Mono.just("Hello World!");
    }

    public static void main(String[] args) {
        Hooks.enableAutomaticContextPropagation();
        SpringApplication.run(Demo2Application.class, args);
    }
}
