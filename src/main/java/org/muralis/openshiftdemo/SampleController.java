package org.muralis.openshiftdemo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.time.ZoneId;

@RestController
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    String home() {
        ZoneId zoneId = ZoneId.of("America/New_York");
        String currentDtTm = java.time.LocalDateTime.now(zoneId).toString();
        return "HI, WELCOME TO REDHAT OPENSHIFT! " + currentDtTm;
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
}
