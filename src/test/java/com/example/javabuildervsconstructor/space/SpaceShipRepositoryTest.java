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
        spaceShipRepository.deleteAll();
        SpaceShip spaceShip = new SpaceShip( "modelfromconstructor", 8.0d);
//        SpaceShip spaceship = spaceShip.captain("Mike").fuel(10.0d).model("Round");
//        SpaceShip.SpaceShipBuilder builder = spaceShip.toBuilder();
//        SpaceShip.SpaceShipBuilder builder = SpaceShip.builder()
//                .model("Pyramid")
//                .fuel(72.2d);

//        spaceShipRepository.save(spaceShip);
//        spaceShipRepository.save(builder.build());
//        spaceShipRepository.save(builder.captain("Mike").build());
//        spaceShipRepository.save(builder.fuel(10.0d).build());
//        spaceShipRepository.save(builder.model("Round").build());


        for (SpaceShip ship : spaceShipRepository.findAll()) {
            System.out.println("Ship in db: " + ship);
        }
        System.out.println("END TEST");
    }
}