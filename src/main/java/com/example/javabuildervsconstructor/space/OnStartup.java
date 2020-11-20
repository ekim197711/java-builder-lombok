package com.example.javabuildervsconstructor.space;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
@Slf4j
public class OnStartup {
    private final SpaceShipRepository spaceShipRepository;

    @PostConstruct
    public void postConstructCode(){
        log.info("Post construct now !!!!- -----");
        createStuff();
    }

    @EventListener
    public void onStartup(ApplicationStartedEvent event){
        log.info("On started event occured!!! ----");
        createStuff();
    }

    private void createStuff(){
//        spaceShipRepository.deleteAll();
        SpaceShip.SpaceShipBuilder builder = SpaceShip.builder()
                .captain("Mike")
                .fuel(72.2d)
                .model("Pyramid");

        spaceShipRepository.save(builder.build());
        spaceShipRepository.save(builder.model("Round").build());
        spaceShipRepository.save(builder.model("Cube").build());
        spaceShipRepository.save(builder.model("Sourcer").build());
        spaceShipRepository.save(builder.captain("Susan").build());
    }
}
