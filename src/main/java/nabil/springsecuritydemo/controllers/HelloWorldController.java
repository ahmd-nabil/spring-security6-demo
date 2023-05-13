package nabil.springsecuritydemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ahmed Nabil
 */
@RestController
@RequestMapping()
public class HelloWorldController {

    protected final static String BASE_URL = "/api/v1/greetings";
    @GetMapping(BASE_URL + "/hi")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Hello world");
    }

    @GetMapping(BASE_URL + "/bye")
    public ResponseEntity<String> sayBye() {
        return ResponseEntity.ok().body("Bye Bye");
    }
}
