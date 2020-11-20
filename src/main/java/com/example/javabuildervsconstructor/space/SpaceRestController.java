package com.example.javabuildervsconstructor.space;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceRestController {

    @PostMapping("/spaceship")
    public String receiveSpaceShip(@RequestBody SpaceShip spaceShip){
        return "Thank for you for: " + spaceShip;
    }
}
