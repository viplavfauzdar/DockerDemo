package com.example.DockerDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/remote")
    public String remote(){
        return "This should remote reload. And hopefully it will! For sure this time!! Lets try one more time...!!!!";
    }

}
