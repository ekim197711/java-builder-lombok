package com.example.javabuildervsconstructor.space;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SpaceShipRepositoryTest {

    @Autowired
    SpaceShipRepository spaceShipRepository;

    @Test
    public void trystuff(){
        System.out.println("BEGIN TEST");
//        spaceShipRepository.deleteAll();
//        SpaceShip.SpaceShipBuilder builder = SpaceShip.builder()
//                .captain("Mike")
//                .fuel(72.2d)
//                .model("Pyramid");
//
//        spaceShipRepository.save(builder.build());
//        spaceShipRepository.save(builder.model("Round").build());
//        spaceShipRepository.save(builder.model("Cube").build());
//        spaceShipRepository.save(builder.model("Sourcer").build());
//        spaceShipRepository.save(builder.captain("Susan").build());


        for (SpaceShip ship : spaceShipRepository.findAll()) {
            System.out.println("Ship in db: " + ship);
        }
        System.out.println("END TEST");
    }
}