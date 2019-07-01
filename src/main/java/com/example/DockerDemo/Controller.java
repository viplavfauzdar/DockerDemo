package com.example.DockerDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/remote")
    public String remote(){
        return "Lets see if this works for live remote reload!!! And it does!";
    }

    @GetMapping("/remote2")
    public String remote2(){
        return "Lets see intellij is really smart";
    }

}
