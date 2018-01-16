package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

// FIXME As long as we don't use this annotation the actuator endpoints are protected based on the configured user/password.
// If we use the annotation, we are getting a 'Full authentication is required to access this resource' if calling a sensitive
// actuator endpoint. And all not sensitive endpoints are only returning minimal information.
@EnableResourceServer
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
