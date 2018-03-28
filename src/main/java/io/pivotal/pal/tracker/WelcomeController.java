package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

    String welcomestring;

   public WelcomeController(@Value("${WELCOME_MESSAGE}")String inputString){
        this.welcomestring = inputString;
    }

    @GetMapping("/")
    public String sayHello() {
        return welcomestring;
    }
}