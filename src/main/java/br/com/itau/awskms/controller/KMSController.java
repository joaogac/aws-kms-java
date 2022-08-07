package br.com.itau.awskms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kms")
public class KMSController {

    Logger logger = LoggerFactory.getLogger(KMSController.class);

    @GetMapping
    public String main() {
        logger.info("main -> Called !");
        return "It works !";
    }

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody String rawText) {
        logger.info("encrypt -> Called !");
        return "SGVsbG8gV29ybGQ=";
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestBody String encrypted) {
        logger.info("decrypt -> Called !");
        return "Hello World";
    }

}
