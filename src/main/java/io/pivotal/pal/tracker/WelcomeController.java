package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD

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
=======
@RestController
public class WelcomeController {


    private String message;


    public WelcomeController(@Value("${WELCOME_MESSAGE}") String message){
        this.message = message;
    }


    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}
>>>>>>> origin/master
