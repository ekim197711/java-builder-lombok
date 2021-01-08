package com.example.javabuildervsconstructor.space;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AsteroidTest {

    @Test
    public void tryStuff(){
        Asteroid asteroid = new Asteroid()
                .name("Mike")
                .speed(20.23d)
                .radius(1234);
        System.out.println(asteroid);
    }
}