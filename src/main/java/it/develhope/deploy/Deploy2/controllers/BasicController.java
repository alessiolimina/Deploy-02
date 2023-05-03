package it.develhope.deploy.Deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/")
public class BasicController {
    @GetMapping("/")
    public String getSum(){
        Random random = new Random();
        int random1 = random.nextInt(10);
        int random2 = random.nextInt(10);
        int sum = random1 + random2;
        return random1 + " + " +  random2  + " = " + sum;
    }
}
