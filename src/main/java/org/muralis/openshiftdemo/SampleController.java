package org.muralis.openshiftdemo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    String home() {
        return "Welcome to REDHAT OPENSHIFT!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
}
